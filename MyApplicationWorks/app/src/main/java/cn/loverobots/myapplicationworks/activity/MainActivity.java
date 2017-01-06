package cn.loverobots.myapplicationworks.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.loverobots.myapplicationworks.R;
import cn.loverobots.myapplicationworks.utils.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn_hot_movie)
    Button mBtnHotMovie;
    @BindView(R.id.btn_stock_eagle)
    Button mBtnStockEagle;
    @BindView(R.id.btn_xyz_reader)
    Button mBtnXyzReader;
    @BindView(R.id.btn_most_news)
    Button mBtnMostNews;
    @BindView(R.id.btn_graduation_project)
    Button mBtnGraduationProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {

    }

    @OnClick({R.id.btn_hot_movie, R.id.btn_stock_eagle, R.id.btn_xyz_reader, R.id.btn_most_news, R.id.btn_graduation_project})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_hot_movie:
                ToastUtil.showToast(MainActivity.this, R.string.btn_hot_movie);
                break;
            case R.id.btn_stock_eagle:
                ToastUtil.showToast(MainActivity.this, R.string.btn_stock_eagle);
                break;
            case R.id.btn_xyz_reader:
                ToastUtil.showToast(MainActivity.this, R.string.btn_xyz_reader);
                break;
            case R.id.btn_most_news:
                ToastUtil.showToast(MainActivity.this, R.string.btn_most_news);
                break;
            case R.id.btn_graduation_project:
                ToastUtil.showToast(MainActivity.this, R.string.btn_graduation_project);
                break;
        }
    }
}
