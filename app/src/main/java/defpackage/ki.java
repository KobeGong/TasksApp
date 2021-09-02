package defpackage;

/* renamed from: ki reason: default package */
/* compiled from: PG */
class ki {
    /* JADX WARNING: type inference failed for: r0v0, types: [kn, kp] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [kn, kp]
      assigns: [kn]
      uses: [kp]
      mth insns count: 3
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.kp a(android.view.View r3) {
        /*
            r2 = this;
            kn r0 = new kn
            android.os.IBinder r1 = r3.getWindowToken()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.a(android.view.View):kp");
    }

    public void a(android.view.View view, float f) {
        java.lang.Float f2 = (java.lang.Float) view.getTag(2131755028);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public float b(android.view.View view) {
        java.lang.Float f = (java.lang.Float) view.getTag(2131755028);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    public void c(android.view.View view) {
        if (view.getTag(2131755028) == null) {
            view.setTag(2131755028, java.lang.Float.valueOf(view.getAlpha()));
        }
    }

    public void d(android.view.View view) {
        if (view.getVisibility() == 0) {
            view.setTag(2131755028, null);
        }
    }

    public void a(android.view.View view, android.graphics.Matrix matrix) {
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void b(android.view.View view, android.graphics.Matrix matrix) {
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void a(android.view.View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    ki() {
    }
}
