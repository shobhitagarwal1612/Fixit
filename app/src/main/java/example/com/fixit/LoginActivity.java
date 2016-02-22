package example.com.fixit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.facebook.FacebookSdk;

/**
 * Created by kartikey on 23/02/16.
 */
public class LoginActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.login_layout_new);
        FacebookSdk.sdkInitialize(this);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
