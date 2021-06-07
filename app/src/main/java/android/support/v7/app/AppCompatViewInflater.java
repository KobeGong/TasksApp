package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: PG */
public class AppCompatViewInflater {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map sConstructorMap = new qr();
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = new Object[2];

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View createSeekBar;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = agt.a(context2);
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
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
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
                    c = '\f';
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
                    c = '\t';
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
            case '\b':
                createSeekBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case '\t':
                createSeekBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case '\n':
                createSeekBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case 11:
                createSeekBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createSeekBar, str);
                break;
            case '\f':
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
    public ack createTextView(Context context, AttributeSet attributeSet) {
        return new ack(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abt createImageView(Context context, AttributeSet attributeSet) {
        return new abt(context, attributeSet);
    }

    public abh createButton(Context context, AttributeSet attributeSet) {
        return new abh(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abq createEditText(Context context, AttributeSet attributeSet) {
        return new abq(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public acb createSpinner(Context context, AttributeSet attributeSet) {
        return new acb(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abr createImageButton(Context context, AttributeSet attributeSet) {
        return new abr(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abi createCheckBox(Context context, AttributeSet attributeSet) {
        return new abi(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abx createRadioButton(Context context, AttributeSet attributeSet) {
        return new abx(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abj createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new abj(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abf createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new abf(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abu createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new abu(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public aby createRatingBar(Context context, AttributeSet attributeSet) {
        return new aby(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public abz createSeekBar(Context context, AttributeSet attributeSet) {
        return new abz(context, attributeSet);
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < sClassPrefixList.length; i++) {
                    View createViewByPrefix = createViewByPrefix(context, str, sClassPrefixList[i]);
                    if (createViewByPrefix != null) {
                        return createViewByPrefix;
                    }
                }
                this.mConstructorArgs[0] = null;
                this.mConstructorArgs[1] = null;
                return null;
            }
            View createViewByPrefix2 = createViewByPrefix(context, str, null);
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
            return createViewByPrefix2;
        } catch (Exception e) {
            return null;
        } finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && sn.a.a(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new xi(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        Constructor<? extends U> constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.dc, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(xu.dl, 0);
        } else {
            i = 0;
        }
        if (!z2 || i != 0) {
            i2 = i;
        } else {
            i2 = obtainStyledAttributes.getResourceId(xu.dm, 0);
        }
        obtainStyledAttributes.recycle();
        if (i2 == 0) {
            return context;
        }
        if (!(context instanceof yf) || ((yf) context).a != i2) {
            return new yf(context, i2);
        }
        return context;
    }
}
