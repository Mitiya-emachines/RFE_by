package master.mitiya.testproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class RegistrationForm extends Activity implements OnClickListener{
	
	EditText etFirstName;
	EditText etLastName;
	EditText etMiddleName;
	EditText etEmail;
	EditText etPhone;
	ImageButton imgbtnMakePhoto;
	Spinner spnrDate;
	Button btnAddDatePossible;
	Button btnSendRequest;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration_form);
		
		btnAddDatePossible = (Button) findViewById(R.id.btnAddDatePossible);
		btnAddDatePossible.setOnClickListener(this);
		btnSendRequest = (Button) findViewById(R.id.btnSendRequest);
		btnSendRequest.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.btnAddDatePossible:
		case R.id.btnSendRequest:
		default:
			break;
		}
		
	}

}
