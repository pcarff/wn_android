package com.map.woodlands.woodlandsmap.Activities;

import android.os.Bundle;

import com.map.woodlands.woodlandsmap.R;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;

/**
 * Created by Jimmy on 4/30/2015.
 */
public class pdfActivity extends PdfViewerActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getPreviousPageImageResource() {
        return R.drawable.left_arrow;
    }

    @Override
    public int getNextPageImageResource() {
        return R.drawable.right_arrow;
    }

    @Override
    public int getZoomInImageResource() {
        return R.drawable.zoom_in;
    }

    @Override
    public int getZoomOutImageResource() {
        return R.drawable.zoom_out;
    }

    @Override
    public int getPdfPasswordLayoutResource() {
        return R.layout.pdf_file_password;
    }

    @Override
    public int getPdfPageNumberResource() {
        return R.layout.dialog_pagenumber;
    }

    @Override
    public int getPdfPasswordEditField() {
        return R.id.etPassword;
    }

    @Override
    public int getPdfPasswordOkButton() {
        return R.id.btOK;
    }



    @Override
    public int getPdfPasswordExitButton() {
        return R.id.btExit;
    }

    @Override
    public int getPdfPageNumberEditField() {
        return R.id.pagenum_edit;
    }
}
