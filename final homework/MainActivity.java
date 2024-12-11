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

        //取得Button控件
        Button btn1 = (Button) findViewById(R.id.button1);
        //注册Button的监听器
        btn1.setOnClickListener(btn1Listener);
        //取得TextView控件
        output = (TextView) findViewById(R.id.lblOutput);


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.button), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
    View.OnClickListener btn1Listener = new View.OnClickListener() {
        public void onClick(View v) {
            //声明两个整型变量用于存储操作数
            int opd1, opd2;
            //声明一个双精度浮点型变量用于存储运算结果，并初始化为0.0
            double result = 0.0;
            //声明EditText类型的变量用于获取用户输入的操作数
            EditText txtOpd1, txtOpd2;
            //声明RadioButton类型的变量用于获取用户选择的运算符
            RadioButton rdbAdd, rdbSubtract,rdbMultiply, rdbDivide;
            //如是否进行整数除法
            CheckBox chkDivide;
            //取得EditText控件
            txtOpd1 = (EditText) findViewById(R.id.txtOpd1);
            txtOpd2 = (EditText) findViewById(R.id.txtOpd2);
            //取得输入值
            opd1 = Integer.parseInt(txtOpd1.getText().toString());
            opd2 = Integer.parseInt(txtOpd2.getText().toString());
            //取得选取的运算符
            rdbAdd = (RadioButton) findViewById(R.id.rdbAdd);
            if (rdbAdd.isChecked()) {
                result = opd1 + opd2; //加
            }
            rdbSubtract = (RadioButton) findViewById(R.id.rdbSubtract);
            if (rdbSubtract.isChecked()) {
                result = opd1 - opd2;  //减
            }
            rdbMultiply = (RadioButton) findViewById(R.id.rdbMultiply);
            if (rdbMultiply.isChecked()) {
                result = opd1 * opd2;  //乘
            }
            rdbDivide = (RadioButton) findViewById(R.id.rdbDivide);
            chkDivide = (CheckBox) findViewById(R.id.chkDivide);
            if (rdbDivide.isChecked()) {
                if (chkDivide.isChecked())
                    result = opd1 / opd2;  //除
                else
                    result = opd1 / (double) opd2;
            }
            output.setText("计算结果 = " + result);
        }
    };

    public void button_Click(View view)
    {
        // 声明两个 double 类型的变量 c 和 f，用于存储摄氏度和华氏度值
        double c,f;
        //取得EditText控件,并将其赋值给相应的text变量
        EditText txtC=(EditText) findViewById(R.id.txtC);
        EditText txtF=(EditText) findViewById(R.id.txtF);
        //取得输入式
        // 从 txtC 控件中获取文本内容，转换为字符串后解析为 double 类型，存入变量 c
        c=Double.parseDouble(txtC.getText().toString());
        //摄氏度换算华氏度公式
        f=(9.0*c)/5.0+32.0;
        txtF.setText(String.valueOf(f));
    }

}
