package android.support.design.theme;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatViewInflater;
import android.util.AttributeSet;

@Keep
/* compiled from: PG */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public abh createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
