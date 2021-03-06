package org.brian.blueirisviewer.ui;

import org.brian.blueirisviewer.BlueIrisViewer;
import org.brian.blueirisviewer.util.Logger;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Version;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class AboutWnd extends UIElement
{
	public AboutWnd(Skin skin)
	{
		super(skin);
	}

	private Texture texLibGDXImage;
	private final String xStreamLicense = "(BSD Style License)\n\nCopyright (c) 2003-2006, Joe Walnes\nCopyright (c) 2006-2011, XStream Committers\nAll rights reserved.\n\nRedistribution and use in source and binary forms, with or without\nmodification, are permitted provided that the following conditions are met:\n\nRedistributions of source code must retain the above copyright notice, this list of\nconditions and the following disclaimer. Redistributions in binary form must reproduce\nthe above copyright notice, this list of conditions and the following disclaimer in\nthe documentation and/or other materials provided with the distribution.\n\nNeither the name of XStream nor the names of its contributors may be used to endorse\nor promote products derived from this software without specific prior written\npermission.\n\nTHIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY\nEXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES\nOF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT\nSHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,\nINCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED\nTO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR\nBUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN\nCONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY\nWAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH\nDAMAGE.\n";

	@Override
	public void onCreate(Skin skin, Window window, Table table)
	{
		window.setTitle("About BlueIrisView");

		Table scrollTable = new Table(skin);
		scrollTable.columnDefaults(0).align(Align.left);
		scrollTable.pad(10, 10, 10, 30);
		
		ScrollPane scrollPane = new ScrollPane(scrollTable, skin);
		scrollPane.setFadeScrollBars(false);
		scrollPane.setScrollingDisabled(true, false);
		table.add(scrollPane).colspan(2).align(Align.center);
		table.row();

		scrollTable.add("BlueIrisView Version 2.7");
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();
		
		scrollTable.add("by Brian Pearce - 2016");
		scrollTable.row();

		scrollTable.add().height(20);
		scrollTable.row();

		scrollTable.add("Powered by libGDX " + Version.VERSION);
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();

		texLibGDXImage = new Texture(Gdx.files.internal("data/libgdx_about.png"));
		Image imgLibGDX = new Image(texLibGDXImage);
		scrollTable.add(imgLibGDX);
		scrollTable.row();

		scrollTable.add().height(20);
		scrollTable.row();
		
		scrollTable.add("BlueIrisView uses the XStream library for settings serialization.\n\nXStream's license follows:");
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();

		Label lblXStreamLicense = new Label(xStreamLicense, skin);
		scrollTable.add(lblXStreamLicense);
		scrollTable.row();

		scrollTable.add().height(20);
		scrollTable.row();
		
		scrollTable.add(new Label("-----------------------------------", skin));
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();
		
		scrollTable.add("BlueIrisView uses the json-simple library.\n\njson-simple is licensed with Apache License, Version 2.0 ");
		scrollTable.row();

		scrollTable.add().height(5);
		scrollTable.row();

		scrollTable.add(new Label("http://www.apache.org/licenses/LICENSE-2.0", skin));
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();


		scrollTable.add().height(20);
		scrollTable.row();
		
		scrollTable.add(new Label("-----------------------------------", skin));
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();

		scrollTable.add(new Label("BlueIrisView optionally uses the libjpeg-turbo library to reduce CPU usage on Windows.", skin));
		scrollTable.row();
		scrollTable.add().height(5);
		scrollTable.row();
		scrollTable.add(new Label("this software is based in part on the work of the Independent JPEG Group", skin));
		scrollTable.row();
		scrollTable.add().height(5);
		scrollTable.row();
		scrollTable.add(new Label("Redistribution and use in source and binary forms, with or without\nmodification, are permitted provided that the following conditions are met:\n\n- Redistributions of source code must retain the above copyright notice,\n  this list of conditions and the following disclaimer.\n- Redistributions in binary form must reproduce the above copyright notice,\n  this list of conditions and the following disclaimer in the documentation\n  and/or other materials provided with the distribution.\n- Neither the name of the libjpeg-turbo Project nor the names of its\n  contributors may be used to endorse or promote products derived from this\n  software without specific prior written permission.\n\nTHIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\",\nAND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE\nIMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE\nARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE\nLIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR\nCONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF\nSUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS\nINTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN\nCONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)\nARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE\nPOSSIBILITY OF SUCH DAMAGE.", skin));
		scrollTable.row();

		scrollTable.add().height(10);
		scrollTable.row();
		

		
		final CheckBox cbSaveErrorLogToDisk = new CheckBox("  Log Errors To Disk", skin);
		cbSaveErrorLogToDisk.setChecked(BlueIrisViewer.bivSettings.logErrorsToDisk);
		cbSaveErrorLogToDisk.addListener(new ChangeListener()
		{
			@Override
			public void changed(ChangeEvent event, Actor actor)
			{
				if(BlueIrisViewer.bivSettings.logErrorsToDisk)
					Logger.debug("Disabling File Logging", AboutWnd.this);
				BlueIrisViewer.bivSettings.logErrorsToDisk = cbSaveErrorLogToDisk.isChecked();
				BlueIrisViewer.bivSettings.Save();
				if(BlueIrisViewer.bivSettings.logErrorsToDisk)
					Logger.debug("Enabled File Logging", AboutWnd.this);
			}
		});
		table.add(cbSaveErrorLogToDisk).align(Align.left);
		
		final TextButton btnClose = new TextButton("Close", skin);
		btnClose.addListener(new ChangeListener()
		{
			@Override
			public void changed(ChangeEvent event, Actor actor)
			{
				hide();
			}
		});
		table.add(btnClose).align(Align.right);
		table.row();
	}

	@Override
	protected void onUpdate(Window window, Table table)
	{
	}

	@Override
	public void onDestroy()
	{
		texLibGDXImage.dispose();
	}
}
