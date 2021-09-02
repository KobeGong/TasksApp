package android.support.v7.app;

/* compiled from: PG */
public class AppCompatViewInflater {
    public static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    public static final java.lang.String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final java.util.Map sConstructorMap = new defpackage.qr();
    public static final java.lang.Class[] sConstructorSignature = {android.content.Context.class, android.util.AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final java.lang.Object[] mConstructorArgs = new java.lang.Object[2];

    public final android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        android.content.Context context2;
        android.view.View createSeekBar;
        android.view.View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = defpackage.agt.a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                createSeekBar = createTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 1:
                createSeekBar = createImageView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 2:
                createSeekBar = createButton(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 3:
                createSeekBar = createEditText(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 4:
                createSeekBar = createSpinner(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 5:
                createSeekBar = createImageButton(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 6:
                createSeekBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 7:
                createSeekBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 8:
                createSeekBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 9:
                createSeekBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 10:
                createSeekBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 11:
                createSeekBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 12:
                createSeekBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            default:
                createSeekBar = createView(context2, str, attributeSet);
                break;
        }
        if (createSeekBar != null || context == context2) {
            view2 = createSeekBar;
        } else {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    public defpackage.ack createTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.ack(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abt createImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abt(context, attributeSet);
    }

    public defpackage.abh createButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abh(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abq createEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abq(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.acb createSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.acb(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abr createImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abr(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abi createCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abi(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abx createRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abx(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abj createCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abj(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abf createAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abf(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abu createMultiAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abu(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.aby createRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.aby(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public defpackage.abz createSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.abz(context, attributeSet);
    }

    private void verifyNotNull(android.view.View view, java.lang.String str) {
        if (view == null) {
            throw new java.lang.IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public android.view.View createView(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: finally extract failed */
    private android.view.View createViewFromTag(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (java.lang.String createViewByPrefix : sClassPrefixList) {
                    android.view.View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        this.mConstructorArgs[0] = null;
                        this.mConstructorArgs[1] = null;
                        return createViewByPrefix2;
                    }
                }
                this.mConstructorArgs[0] = null;
                this.mConstructorArgs[1] = null;
                return null;
            }
            android.view.View createViewByPrefix3 = createViewByPrefix(context, str, null);
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            return createViewByPrefix3;
        } catch (java.lang.Exception e) {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            return null;
        } catch (Throwable th) {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            throw th;
        }
    }

    private void checkOnClickListener(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        if ((context instanceof android.content.ContextWrapper) && defpackage.sn.a.a(view)) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new defpackage.xi(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private android.view.View createViewByPrefix(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(android.view.View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (java.lang.Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.mConstructorArgs);
    }

    private static android.content.Context themifyContext(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        int i2;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.dc, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(defpackage.xu.dl, 0);
        } else {
            i = 0;
        }
        if (!z2 || i != 0) {
            i2 = i;
        } else {
            i2 = obtainStyledAttributes.getResourceId(defpackage.xu.dm, 0);
        }
        obtainStyledAttributes.recycle();
        if (i2 == 0) {
            return context;
        }
        if (!(context instanceof defpackage.yf) || ((defpackage.yf) context).a != i2) {
            return new defpackage.yf(context, i2);
        }
        return context;
    }
}
