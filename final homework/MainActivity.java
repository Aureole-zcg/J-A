package experiment1.ZhahngChenguang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//活动建立调用此方法
        super.onCreate(savedInstanceState);//调用父类的onCreate()
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);//设置Activity使用的布局资源文件

        // 取得Button控件
        Button btn1 = (Button) findViewById(R.id.button1);
        // 注册Button的监听器
        btn1.setOnClickListener(btn1Listener);
        // 取得TextView控件
        output = (TextView) findViewById(R.id.lblOutput);


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.button), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
    View.OnClickListener btn1Listener = new View.OnClickListener() {
        public void onClick(View v) {
            int opd1, opd2;
            double result = 0.0;
            EditText txtOpd1, txtOpd2;
            RadioButton rdbAdd, rdbSubtract,
                    rdbMultiply, rdbDivide;
            CheckBox chkDivide;
            // 取得EditText控件
            txtOpd1 = (EditText) findViewById(R.id.txtOpd1);
            txtOpd2 = (EditText) findViewById(R.id.txtOpd2);
            // 取得输入值
            opd1 = Integer.parseInt(txtOpd1.getText().toString());
            opd2 = Integer.parseInt(txtOpd2.getText().toString());
            // 取得选取的运算符
            rdbAdd = (RadioButton) findViewById(R.id.rdbAdd);
            if (rdbAdd.isChecked()) {
                result = opd1 + opd2; // 加
            }
            rdbSubtract = (RadioButton) findViewById(R.id.rdbSubtract);
            if (rdbSubtract.isChecked()) {
                result = opd1 - opd2;  // 减
            }
            rdbMultiply = (RadioButton) findViewById(R.id.rdbMultiply);
            if (rdbMultiply.isChecked()) {
                result = opd1 * opd2;  // 乘
            }
            rdbDivide = (RadioButton) findViewById(R.id.rdbDivide);
            chkDivide = (CheckBox) findViewById(R.id.chkDivide);
            if (rdbDivide.isChecked()) {
                if (chkDivide.isChecked())
                    result = opd1 / opd2;  // 除
                else
                    result = opd1 / (double) opd2;
            }
            output.setText("计算结果 = " + result);
        }
    };

    public void button_Click(View view)
    {
        double c,f;
        //取得EditText控件
        EditText txtC=(EditText) findViewById(R.id.txtC);
        EditText txtF=(EditText) findViewById(R.id.txtF);
        //取得输入式
        c=Double.parseDouble(txtC.getText().toString());
        //摄氏度换算华氏度公式
        f=(9.0*c)/5.0+32.0;
        txtF.setText(String.valueOf(f));
    }

}
