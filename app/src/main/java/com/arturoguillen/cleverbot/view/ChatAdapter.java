package com.arturoguillen.cleverbot.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.entity.Message;

import java.util.ArrayList;

/**
 * Created by arturo.guillen on 22/02/2017.
 */
public class ChatAdapter extends RecyclerView.Adapter {

    private ArrayList<Message> chatContent;
    private static final int LEFT_MESSAGE = 0;
    private static final int RIGHT_MESSAGE = 1;


    public ChatAdapter() {
        this.chatContent = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == LEFT_MESSAGE) {
            return new MessageCard(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_message_left, parent, false));
        } else {
            return new MessageCard(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_message_right, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MessageCard) holder).fillMessageCard(chatContent.get(position));
    }

    @Override
    public int getItemCount() {
        return chatContent.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (chatContent.get(position).isItsMe()) {
            return LEFT_MESSAGE;
        } else {
            return RIGHT_MESSAGE;
        }
    }

    public void addMessage(Message message) {
        chatContent.add(message);
    }

}
