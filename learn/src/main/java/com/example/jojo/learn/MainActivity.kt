package com.example.jojo.learn

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pieMarkChatView.setCurrentProgress(78)
        //        mytextview = findViewById(R.id.mytextview);
        //当前实际的步数
        var mCurrentStep: Float = 9709f
        sportstepview.startCountStep(mCurrentStep)

        var datas = listOf<Int>(24, 20, 22, 15, 10, 8)
        var xList = listOf<String>("1月份", "2月份", "3月份", "4月份", "5月份", "6月份")

        //根据数据的最大值生成上下对应的Y轴坐标范围
        var ylist = mutableListOf<Int>()
        var maxYAxis: Int? = Collections.max(datas)
        if (maxYAxis!! % 2 == 0) {
            maxYAxis = maxYAxis + 2
        } else {
            maxYAxis = maxYAxis + 1
        }
        var keduSpace = (maxYAxis / datas.size) + 1
        for (i in 0..datas.size) {
            ylist.add(0 + keduSpace * i)
        }
        barchartview.updateValueData(datas, xList, ylist)
        linechartview.updateData(datas, xList, ylist)
        //测试绘制填充渐变色的曲线图
        linechartshadowview.updateData(datas, xList, ylist)

        //  添加的是百分比
        var rateList = listOf<Float>(40f, 10f, 5f, 45f)
        // 添加的颜色
        var colors = mutableListOf<Int>()
        colors.add(ContextCompat.getColor(this, R.color.color_55c7f2))
        colors.add(ContextCompat.getColor(this, R.color.color_34617e))
        colors.add(ContextCompat.getColor(this, R.color.color_7c80fe))
        colors.add(ContextCompat.getColor(this, R.color.color_f1b133))
        var showTextList = mutableListOf<String>()
        for (i in 0..rateList.size - 1) {
            showTextList.add(rateList.get(i).toString() + "%")
        }
        piechartview.setShowTextList(showTextList);
        piechartview.setShow(colors, rateList, true, true)
        //ViewCompat.animate(barchartview).scaleX(0.5f).scaleY(0.5f).setDuration(0).start()
//        var rate = listOf<Float>(15f/100, 35f/100, 30f/100, 20f/100)
        var rate = listOf<Float>(25f / 100, 25f / 100, 25f / 100, 25f / 100)
        pieview.updateDate(rate, colors, true)
        pieoview.updateDate(rate, colors, false)



        //测试带渐变填充色的曲线图
        var timeList = ArrayList<Int>()
        timeList.add(30)
        timeList.add(20)
        timeList.add(22)
        timeList.add(8)
        timeList.add(4)
        timeList.add(0)
        timeList.add(0)
        var bottomList = ArrayList<String>()
        bottomList.add("5.22")
        bottomList.add("5.23")
        bottomList.add("5.24")
        bottomList.add("5.25")
        bottomList.add("5.26")
        bottomList.add("5.27")
        bottomList.add("5.28")
        studybendline.updateTime(timeList, bottomList )

    }

    //    public void textLayoutLeft(View v) {
    //        mytextview.reLayoutText(0);
    //    }
    //    public void textLayoutCenter(View v) {
    //        mytextview.reLayoutText(1);
    //    }


}
