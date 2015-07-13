package com.example.calvinkwan.incident_command_center;

import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.ListFragment;
import com.parse.Parse;
import com.parse.ParseObject;

import java.util.List;

/**
 * Created by calvinkwan on 7/11/15.
 */
public class MessageAdapter extends ArrayAdapter<ParseObject>
{
    protected Context mContext;
    protected List<ParseObject> mMessages;

    public MessageAdapter(Context context, List<ParseObject> messges)
    {
        super(context, R.layout.message_item);
        mContext = context;
        mMessages = messges;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;


        if (convertView == null)
        {
            holder = new ViewHolder();
            holder.iconImageView = (ImageView)convertView.findViewById(R.id.messageIcon);
            holder.nameLabel = (TextView)convertView.findViewById(R.id.senderLabel);
            convertView.setTag(holder);
        }

        else
        {
            holder = (ViewHolder)convertView.getTag();
        }


        ParseObject message = mMessages.get(position);
        if(message.getString(ParseConstants.KEY_FILE_TYPE).equals(ParseConstants.TYPE_IMAGE))
        {
            holder.iconImageView.setImageResource(R.mipmap.ic_action_picture);
        }
        else
        {
            holder.iconImageView.setImageResource(R.mipmap.ic_action_play_over_video);
        }
        holder.nameLabel.setText(message.getString(ParseConstants.KEY_SENDER_NAME));

        return convertView;
    }
    private static class ViewHolder
    {
        ImageView iconImageView;
        TextView nameLabel;
    }
}
