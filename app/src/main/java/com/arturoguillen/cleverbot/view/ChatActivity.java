package com.arturoguillen.cleverbot.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.arturoguillen.cleverbot.Constants;
import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.di.component.NetComponent;
import com.arturoguillen.cleverbot.entity.Message;
import com.arturoguillen.cleverbot.presenter.ChatPresenter;
import com.arturoguillen.cleverbot.presenter.ChatView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by PC on 11/02/2017.
 */

public class ChatActivity extends BaseActivity implements ChatView {

    @BindView(R.id.chat_recycler)
    RecyclerView chatRecycler;

    @BindView(R.id.chat_input)
    EditText chatInput;

    @BindView(R.id.chat_progress)
    ProgressBar progressBar;

    @Inject
    ChatPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
        setContentView(R.layout.activtiy_chat);
        ButterKnife.bind(this);
        setupRecyclerView(chatRecycler);
    }

    private void setupRecyclerView(RecyclerView chatRecycler) {
        ChatAdapter chatAdapter = new ChatAdapter();
        chatRecycler.setAdapter(chatAdapter);
        chatRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @OnClick(R.id.chat_send_btn)
    public void sendInput() {
        String text = String.valueOf(chatInput.getText());
        ChatAdapter adapter = (ChatAdapter) chatRecycler.getAdapter();
        adapter.addMessage(new Message(text, true));
        presenter.sendMessageToBot(text);
        chatRecycler.smoothScrollToPosition(chatRecycler.getAdapter().getItemCount());
    }

    @Override
    protected void injectComponent(NetComponent component) {
        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    @Override
    public void showProgressIndicator() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void showMessage(int stringId) {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void hideProgressIndicator() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showResponse(String response) {
        chatInput.setText("");
        ChatAdapter adapter = (ChatAdapter) chatRecycler.getAdapter();
        adapter.addMessage(new Message(response, false));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            ChatAdapter adapter = (ChatAdapter) chatRecycler.getAdapter();
            adapter.setChatContent((ArrayList<Message>) savedInstanceState.getSerializable(Constants.RECYCLEVIEW_CONTENT));
            chatRecycler.getLayoutManager().onRestoreInstanceState(savedInstanceState.getParcelable(Constants.RECYCLERVIEW_STATE));
            presenter.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ChatAdapter adapter = (ChatAdapter) chatRecycler.getAdapter();
        outState.putParcelable(Constants.RECYCLERVIEW_STATE, chatRecycler.getLayoutManager().onSaveInstanceState());
        outState.putSerializable(Constants.RECYCLEVIEW_CONTENT, adapter.getChatContent());
        presenter.onSaveInstanceState(outState);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
