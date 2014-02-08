package com.example.imageviewandroid2;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class PratosExibir extends Activity {
	
	ImageView pro;
	TextView nome;
	String cod;
	int cont;
	
	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(com.example.imageviewandroid2.R.layout.detalhesproduto);
		
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		nome=(TextView) findViewById(com.example.imageviewandroid2.R.id.textView1);
		pro = (ImageView)findViewById(com.example.imageviewandroid2.R.id.imageView1);
		
		cont=0;
		if(cont==0)
		{
			pro.setImageResource(com.example.imageviewandroid2.R.drawable.ic_launcher);
			nome.setText(getIntent().getStringExtra("Nome"));
		}
	}

	
	public void proximo(View v)
	{
		cont++;
		if(cont<1)
		{
			cont=1;
		}
		if (cont == 1)
		{ 
			pro.setImageResource(com.example.imageviewandroid2.R.drawable.navigation_left);
			nome.setText("PRATO 1"); 
		}

		
	}
}
