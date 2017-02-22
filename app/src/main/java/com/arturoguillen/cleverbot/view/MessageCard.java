package com.arturoguillen.cleverbot.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.entity.Message;

/**
 * Created by arturo.guillen on 22/02/2017.
 */
public class MessageCard extends RecyclerView.ViewHolder {

    private TextView tvWhoIAm;
    private TextView tvText;

    public MessageCard(View itemView) {
        super(itemView);
        this.tvWhoIAm = (TextView) itemView.findViewById(R.id.card_message_whoiam);
        this.tvText = (TextView) itemView.findViewById(R.id.card_message_text);
    }

    void fillMessageCard(Message message) {
        tvText.setText(message.getText());
        if (message.isItsMe()) {
            tvWhoIAm.setText("YO");
        } else {
            tvWhoIAm.setText("CLEVERBOT");
        }
    }
}
