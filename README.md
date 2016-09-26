> “Let's Start. ”

Android Button点击事件以及响应的四种方式,下面我们分别介绍一下四种方式的使用。


## First 匿名内部类

button1.setOnClickListener(new Button.OnClickListener() {
	@Override
	public void onClick(View v) {
		display.setText("现在使用的是匿名内部类的方式在实现button点击事件的响应");
	}
});


## Second 自定义点击事件监听类

在onCreate方法里面加上
button2.setOnClickListener(new MyListener());

private class MyListener implements View.OnClickListener{
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button2){
			display.setText("现在使用的是自定义点击事件监听类来实现button点击事件的响应");
		}
	}
}

## Third 实现View.OnClickListener接口

在我们Activity类上实现View.OnClickListener接口

在onCreate方法里面加上
button3.setOnClickListener(this);

@Override
public void onClick(View v) {
	button3.setText("现在是使用实现View.OnClickListener接口的方式实现button点击事件的响应");
}

## Fourth xml布局文件指定按钮的onClick属性

在xml布局文件指定按钮的onClick属性，设置值为:button4,实现该方法如下

public void button4(View v){
	button3.setText("现在是使用在xml布局文件指定按钮的onClick属性方式实现button点击事件的响应");
}
