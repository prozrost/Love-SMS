package prozrost.testapp;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by vnvbnv on 07.01.2016.
 */
public class CheckBoxFragment extends Fragment implements View.OnClickListener {
    CheckBox checkBox1,checkBox2,checkBox3;
    TextView textView;
    EditText editText1,editText2,editText3;
    float fet,set,thet,sum;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.checkbox_layout, null);
        checkBox1 = (CheckBox)v.findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox)v.findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox)v.findViewById(R.id.checkbox3);
        editText1 = (EditText)v.findViewById(R.id.edittext1);
        editText2 = (EditText)v.findViewById(R.id.edittext2);
        editText3 = (EditText)v.findViewById(R.id.edittext3);
        textView = (TextView)v.findViewById(R.id.textView);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        TextView TitleView = (TextView)v.findViewById(R.id.textView2);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(),"fonts/design.graffiti.festus.ttf");
        TitleView.setTypeface(typeface);

        return v;


    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.checkbox1:
                if(checkBox1.isChecked()){
                    fet = Float.parseFloat(editText1.getText().toString());
                }
else fet=0;
                break;
            case R.id.checkbox2:
                if(checkBox2.isChecked()){
                    set = Float.parseFloat(editText2.getText().toString());
                }
                else set=0;
                break;
            case R.id.checkbox3:
                if(checkBox3.isChecked()){
                    thet = Float.parseFloat(editText3.getText().toString());
                }
                else thet=0;
break;




        }
        sum = fet+set+thet;
        textView.setText("Result ="+""+sum);
    }
}
