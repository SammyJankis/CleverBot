package com.arturoguillen.cleverbot.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.entity.Message;
import com.arturoguillen.cleverbot.utils.DateUtils;

/**
 * Created by arturo.guillen on 22/02/2017.
 */
public class MessageCard extends RecyclerView.ViewHolder {

    private TextView tvWhoIAm;
    private TextView tvText;
    private TextView tvDate;

    public MessageCard(View itemView) {
        super(itemView);
        this.tvWhoIAm = (TextView) itemView.findViewById(R.id.card_message_whoiam);
        this.tvText = (TextView) itemView.findViewById(R.id.card_message_text);
        this.tvDate = (TextView) itemView.findViewById(R.id.card_message_date);
    }

    void fillMessageCard(Message message) {
        tvText.setText(message.getText());
        tvDate.setText(DateUtils.getStringFromDate(message.getDate()));
        if (message.isItsMe()) {
            tvWhoIAm.setText("YO");
        } else {
            tvWhoIAm.setText("CLEVERBOT");
        }
    }
}
