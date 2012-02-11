package peac.android.na;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page2  extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2); 
        
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        
        /*
        int checkedRadioButton = radioGroup.getCheckedRadioButtonId();
         
        String radioButtonSelected = "";
         
        switch (checkedRadioButton) {
          case R.id.radio_blue : radioButtonSelected = "radiobutton1";
                           	              break;
          case R.id.radio_red : radioButtonSelected = "radiobutton2";
        		                      break;
        }
        */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        	@Override
        	public void onCheckedChanged(RadioGroup group, int checkedId) {
        		//tmp = (Integer) findViewById(checkedId).getTag();
        		//if (tmp != null) selectedPlayer = tmp;
        		
                int checkedRadioButton = group.getCheckedRadioButtonId();
                
                String radioButtonSelected = "";
                 
                switch (checkedRadioButton) {
                  case R.id.radio_blue : radioButtonSelected = "radiobutton1";
                    break;
                  case R.id.radio_red : radioButtonSelected = "radiobutton2";
                	break;
                }
        		
                Toast.makeText(page2.this, "Radio" + radioButtonSelected, Toast.LENGTH_SHORT).show();
        	}
        });
        
    }
}
