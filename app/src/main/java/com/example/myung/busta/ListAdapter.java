package com.example.myung.busta;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by myung on 2016-07-19.
 */
public class ListAdapter extends BaseAdapter {

    private ArrayList<String> mTitle;
    private ArrayList<String> mContent;

    public ListAdapter() {
        mTitle = new ArrayList<String>();
    }

    @Override
    public int getCount() {
        return mTitle.size();
    }

    @Override
    public Object getItem(int position) {
        return mTitle.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();
        if ( convertView == null ) {
            // view가 null일 경우 커스텀 레이아웃을 얻어 옴
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_listview, parent, false);

            // TextView에 현재 position의 문자열 추가
            TextView text = (TextView) convertView.findViewById(R.id.title);
            text.setText(mTitle.get(position));

            // 리스트 아이템을 터치 했을 때 이벤트 발생
            convertView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // 터치 시 해당 아이템 이름 출력
                    Toast.makeText(context, "리스트 클릭 : "+mTitle.get(pos), Toast.LENGTH_SHORT).show();
                }
            });

            // 리스트 아이템을 길게 터치 했을 떄 이벤트 발생
            convertView.setOnLongClickListener(new View.OnLongClickListener() {

                @Override
                public boolean onLongClick(View v) {
                    // 터치 시 해당 아이템 이름 출력
                    Toast.makeText(context, "리스트 롱 클릭 : "+mTitle.get(pos), Toast.LENGTH_SHORT).show();
                    return true;
                }
            });
        }

        return convertView;
    }

    // 외부에서 아이템 추가 요청 시 사용
    public void add(String _msg) {
        mTitle.add(_msg);
    }

    // 외부에서 아이템 삭제 요청 시 사용
    public void remove(int _position) {
        mTitle.remove(_position);
    }
}
