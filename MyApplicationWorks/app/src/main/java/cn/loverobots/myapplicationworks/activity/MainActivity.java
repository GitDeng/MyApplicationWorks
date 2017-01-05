package cn.loverobots.myapplicationworks.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.loverobots.myapplicationworks.R;
import cn.loverobots.myapplicationworks.utils.ToastUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnHotMovie, mBtnStockEagle, mBtnXyzReader, mBtnMostNews, mBtnGraduationProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mBtnHotMovie = (Button) findViewById(R.id.btn_hot_movie);
        mBtnStockEagle = (Button) findViewById(R.id.btn_stock_eagle);
        mBtnXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        mBtnMostNews = (Button) findViewById(R.id.btn_most_news);
        mBtnGraduationProject = (Button) findViewById(R.id.btn_graduation_project);

        mBtnHotMovie.setOnClickListener(this);
        mBtnStockEagle.setOnClickListener(this);
        mBtnXyzReader.setOnClickListener(this);
        mBtnMostNews.setOnClickListener(this);
        mBtnGraduationProject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_hot_movie: // 最热电影
                ToastUtil.showToast(MainActivity.this, R.string.btn_hot_movie);
                break;
            case R.id.btn_stock_eagle: // 股票雄鹰
                ToastUtil.showToast(MainActivity.this, R.string.btn_stock_eagle);
                break;
            case R.id.btn_xyz_reader: // xyz阅读器
                ToastUtil.showToast(MainActivity.this, R.string.btn_xyz_reader);
                break;
            case R.id.btn_most_news: // 最新闻
                ToastUtil.showToast(MainActivity.this, R.string.btn_most_news);
                break;
            case R.id.btn_graduation_project: // 毕业设计
                ToastUtil.showToast(MainActivity.this, R.string.btn_graduation_project);
                break;
        }
    }
}
