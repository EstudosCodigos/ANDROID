package com.example.imageviewandroid2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ImageViewAndroidActivity extends ListActivity {

	private static final String[] OPCOES={"Carregar Imagens","Exibir Imagens "};
	private static final Object[] ACOES={CarregarImagemUrl.class,PratosExibir.class};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,OPCOES);
		setListAdapter(adapter);
	}

	protected void  onListItemClick(ListView l,View v,int position,long id) 
	{
		super.onListItemClick(l, v, position, id);
		Intent it =new Intent(getBaseContext(),CarregarImagemUrl.class);
		
		startActivity(it);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image_view_android, menu);
		return true;
	}

}
