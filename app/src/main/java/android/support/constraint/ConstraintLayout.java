package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
public class ConstraintLayout extends ViewGroup {
    private SparseArray a = new SparseArray();
    private final ArrayList b = new ArrayList(100);
    private ci c = new ci();
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    private boolean h = true;
    private int i = 2;
    private bv j = null;

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void setId(int i2) {
        this.a.remove(getId());
        super.setId(i2);
        this.a.put(getId(), this);
    }

    private final void a(AttributeSet attributeSet) {
        this.c.I = this;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, by.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == by.e) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == by.d) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == by.c) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == by.b) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == by.U) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == by.g) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    this.j = new bv();
                    bv bvVar = this.j;
                    Context context = getContext();
                    XmlResourceParser xml = context.getResources().getXml(resourceId);
                    try {
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            switch (eventType) {
                                case 0:
                                    xml.getName();
                                    break;
                                case 2:
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    bw bwVar = new bw();
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, by.V);
                                    bv.a(bwVar, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        bwVar.a = true;
                                    }
                                    bvVar.a.put(Integer.valueOf(bwVar.d), bwVar);
                                    break;
                            }
                        }
                    } catch (IOException | XmlPullParserException e2) {
                        cza.a.a(e2);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.ac = this.i;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ch a2 = a(view);
        if ((view instanceof bx) && !(a2 instanceof cj)) {
            bu buVar = (bu) view.getLayoutParams();
            buVar.X = new cj();
            buVar.P = true;
            ((cj) buVar.X).h(buVar.L);
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.a(a(view));
        this.h = true;
    }

    private final ch a(int i2) {
        if (i2 == 0) {
            return this.c;
        }
        View view = (View) this.a.get(i2);
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((bu) view.getLayoutParams()).X;
    }

    private final ch a(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((bu) view.getLayoutParams()).X;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0508  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 2130
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            bu buVar = (bu) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || buVar.P || isInEditMode) {
                ch chVar = buVar.X;
                int g2 = chVar.g();
                int h2 = chVar.h();
                childAt.layout(g2, h2, chVar.c() + g2, chVar.f() + h2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bu(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bu;
    }

    public void requestLayout() {
        super.requestLayout();
        this.h = true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bu();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bu(getContext(), attributeSet);
    }
}
