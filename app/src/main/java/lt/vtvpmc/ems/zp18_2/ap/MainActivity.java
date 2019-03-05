package lt.vtvpmc.ems.zp18_2.ap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText nameField;
    Button btnDisplayName;
    TextView displayNameLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplayName = (Button) findViewById(R.id.buttonEnterName);
        displayNameLabel = (TextView) findViewById(R.id.displayNameLabel);

        btnDisplayName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameField = (EditText) findViewById(R.id.nameField);

                displayNameLabel.setText(nameField.getText());

            }
        });


    }
}
