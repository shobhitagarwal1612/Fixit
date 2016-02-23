package example.com.fixit;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

     Intent intent=new Intent(MainActivity.this,MenuActivity.class);
    startActivity(intent);
    }
}
