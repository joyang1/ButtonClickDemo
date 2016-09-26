## First 匿名内部类

button1.setOnClickListener(new Button.OnClickListener() {<br/>
	@Override<br/>
	public void onClick(View v) {<br/>
		display.setText("现在使用的是匿名内部类的方式在实现button点击事件的响应");<br/>
	}<br/>
});<br/>


## Second 自定义点击事件监听类

在onCreate方法里面加上<br/>
button2.setOnClickListener(new MyListener());

private class MyListener implements View.OnClickListener{<br/>
	@Override<br/>
	public void onClick(View v) {<br/>
		if(v.getId() == R.id.button2){<br/>
			display.setText("现在使用的是自定义点击事件监听类来实现button点击事件的响应");<br/>
		}<br/>
	}<br/>
}<br/>

## Third 实现View.OnClickListener接口

在我们Activity类上实现View.OnClickListener接口

在onCreate方法里面加上
button3.setOnClickListener(this);

@Override<br/>
public void onClick(View v) {<br/>
	display.setText("现在是使用实现View.OnClickListener接口的方式实现button点击事件的响应");<br/>
}<br/>

## Fourth xml布局文件指定按钮的onClick属性

在xml布局文件指定按钮的onClick属性，设置值为:button4,实现该方法如下

public void button4(View v){<br/>
	display.setText("现在是使用在xml布局文件指定按钮的onClick属性方式实现button点击事件的响应");<br/>
}<br/>
