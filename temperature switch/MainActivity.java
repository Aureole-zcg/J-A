
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.button), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
    //button控件的事件处理办法
    public void button_Click(View view)
    {
        int c;
        double f;
        //取得EditText控件
        EditText txtC=(EditText) findViewById(R.id.txtC);
        EditText txtF=(EditText) findViewById(R.id.txtF);
        //取得输入式
        c=Integer.parseInt(txtC.getText().toString());
        //摄氏度换算华氏度公式
        f=(9.0*c)/5.0+32.0;
        txtF.setText(String.valueOf(f));
    }
}
