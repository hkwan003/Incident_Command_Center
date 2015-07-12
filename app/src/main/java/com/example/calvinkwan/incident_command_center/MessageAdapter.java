package com.example.calvinkwan.incident_command_center;

import android.content.Context;
import android.widget.ArrayAdapter;

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
}
