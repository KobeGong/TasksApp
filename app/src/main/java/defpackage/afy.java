package defpackage;

/* renamed from: afy reason: default package */
/* compiled from: PG */
class afy extends android.content.res.Resources {
    private final android.content.res.Resources a;

    public afy(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    public java.lang.CharSequence getText(int i) {
        return this.a.getText(i);
    }

    public java.lang.CharSequence getQuantityText(int i, int i2) {
        return this.a.getQuantityText(i, i2);
    }

    public java.lang.String getString(int i) {
        return this.a.getString(i);
    }

    public java.lang.String getString(int i, java.lang.Object... objArr) {
        return this.a.getString(i, objArr);
    }

    public java.lang.String getQuantityString(int i, int i2, java.lang.Object... objArr) {
        return this.a.getQuantityString(i, i2, objArr);
    }

    public java.lang.String getQuantityString(int i, int i2) {
        return this.a.getQuantityString(i, i2);
    }

    public java.lang.CharSequence getText(int i, java.lang.CharSequence charSequence) {
        return this.a.getText(i, charSequence);
    }

    public java.lang.CharSequence[] getTextArray(int i) {
        return this.a.getTextArray(i);
    }

    public java.lang.String[] getStringArray(int i) {
        return this.a.getStringArray(i);
    }

    public int[] getIntArray(int i) {
        return this.a.getIntArray(i);
    }

    public android.content.res.TypedArray obtainTypedArray(int i) {
        return this.a.obtainTypedArray(i);
    }

    public float getDimension(int i) {
        return this.a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.a.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.a.getFraction(i, i2, i3);
    }

    public android.graphics.drawable.Drawable getDrawable(int i) {
        return this.a.getDrawable(i);
    }

    public android.graphics.drawable.Drawable getDrawable(int i, android.content.res.Resources.Theme theme) {
        return this.a.getDrawable(i, theme);
    }

    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2) {
        return this.a.getDrawableForDensity(i, i2);
    }

    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2, android.content.res.Resources.Theme theme) {
        return this.a.getDrawableForDensity(i, i2, theme);
    }

    public android.graphics.Movie getMovie(int i) {
        return this.a.getMovie(i);
    }

    public int getColor(int i) {
        return this.a.getColor(i);
    }

    public android.content.res.ColorStateList getColorStateList(int i) {
        return this.a.getColorStateList(i);
    }

    public boolean getBoolean(int i) {
        return this.a.getBoolean(i);
    }

    public int getInteger(int i) {
        return this.a.getInteger(i);
    }

    public android.content.res.XmlResourceParser getLayout(int i) {
        return this.a.getLayout(i);
    }

    public android.content.res.XmlResourceParser getAnimation(int i) {
        return this.a.getAnimation(i);
    }

    public android.content.res.XmlResourceParser getXml(int i) {
        return this.a.getXml(i);
    }

    public java.io.InputStream openRawResource(int i) {
        return this.a.openRawResource(i);
    }

    public java.io.InputStream openRawResource(int i, android.util.TypedValue typedValue) {
        return this.a.openRawResource(i, typedValue);
    }

    public android.content.res.AssetFileDescriptor openRawResourceFd(int i) {
        return this.a.openRawResourceFd(i);
    }

    public void getValue(int i, android.util.TypedValue typedValue, boolean z) {
        this.a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, android.util.TypedValue typedValue, boolean z) {
        this.a.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z) {
        this.a.getValue(str, typedValue, z);
    }

    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.a.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.a != null) {
            this.a.updateConfiguration(configuration, displayMetrics);
        }
    }

    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    public android.content.res.Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.a.getIdentifier(str, str2, str3);
    }

    public java.lang.String getResourceName(int i) {
        return this.a.getResourceName(i);
    }

    public java.lang.String getResourcePackageName(int i) {
        return this.a.getResourcePackageName(i);
    }

    public java.lang.String getResourceTypeName(int i) {
        return this.a.getResourceTypeName(i);
    }

    public java.lang.String getResourceEntryName(int i) {
        return this.a.getResourceEntryName(i);
    }

    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.a.parseBundleExtra(str, attributeSet, bundle);
    }
}
