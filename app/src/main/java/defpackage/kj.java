package defpackage;

/* renamed from: kj reason: default package */
/* compiled from: PG */
public class kj extends defpackage.je {
    private static final java.lang.String[] m = {"android:visibility:visibility", "android:visibility:parent"};
    public int l = 3;

    public final java.lang.String[] a() {
        return m;
    }

    private static void d(defpackage.jr jrVar) {
        jrVar.a.put("android:visibility:visibility", java.lang.Integer.valueOf(jrVar.b.getVisibility()));
        jrVar.a.put("android:visibility:parent", jrVar.b.getParent());
        int[] iArr = new int[2];
        jrVar.b.getLocationOnScreen(iArr);
        jrVar.a.put("android:visibility:screenLocation", iArr);
    }

    public void a(defpackage.jr jrVar) {
        d(jrVar);
    }

    public final void b(defpackage.jr jrVar) {
        d(jrVar);
    }

    private static defpackage.km b(defpackage.jr jrVar, defpackage.jr jrVar2) {
        defpackage.km kmVar = new defpackage.km();
        kmVar.a = false;
        kmVar.b = false;
        if (jrVar == null || !jrVar.a.containsKey("android:visibility:visibility")) {
            kmVar.c = -1;
            kmVar.e = null;
        } else {
            kmVar.c = ((java.lang.Integer) jrVar.a.get("android:visibility:visibility")).intValue();
            kmVar.e = (android.view.ViewGroup) jrVar.a.get("android:visibility:parent");
        }
        if (jrVar2 == null || !jrVar2.a.containsKey("android:visibility:visibility")) {
            kmVar.d = -1;
            kmVar.f = null;
        } else {
            kmVar.d = ((java.lang.Integer) jrVar2.a.get("android:visibility:visibility")).intValue();
            kmVar.f = (android.view.ViewGroup) jrVar2.a.get("android:visibility:parent");
        }
        if (jrVar == null || jrVar2 == null) {
            if (jrVar == null && kmVar.d == 0) {
                kmVar.b = true;
                kmVar.a = true;
            } else if (jrVar2 == null && kmVar.c == 0) {
                kmVar.b = false;
                kmVar.a = true;
            }
        } else if (kmVar.c == kmVar.d && kmVar.e == kmVar.f) {
            return kmVar;
        } else {
            if (kmVar.c != kmVar.d) {
                if (kmVar.c == 0) {
                    kmVar.b = false;
                    kmVar.a = true;
                } else if (kmVar.d == 0) {
                    kmVar.b = true;
                    kmVar.a = true;
                }
            } else if (kmVar.f == null) {
                kmVar.b = false;
                kmVar.a = true;
            } else if (kmVar.e == null) {
                kmVar.b = true;
                kmVar.a = true;
            }
        }
        return kmVar;
    }

    public final android.animation.Animator a(android.view.ViewGroup viewGroup, defpackage.jr jrVar, defpackage.jr jrVar2) {
        defpackage.km b = b(jrVar, jrVar2);
        if (!b.a || (b.e == null && b.f == null)) {
            return null;
        }
        if (!b.b) {
            int i = b.d;
            if ((this.l & 2) == 2) {
                android.view.View view = jrVar != null ? jrVar.b : null;
                android.view.View view2 = jrVar2 != null ? jrVar2.b : null;
                android.view.View view3 = null;
                android.view.View view4 = null;
                if (view2 == null || view2.getParent() == null) {
                    if (view2 != null) {
                        view3 = view2;
                    } else if (view != null) {
                        if (view.getParent() != null) {
                            if (view.getParent() instanceof android.view.View) {
                                android.view.View view5 = (android.view.View) view.getParent();
                                if (!b(a(view5, true), b(view5, true)).a) {
                                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                                    matrix.setTranslate((float) (-view5.getScrollX()), (float) (-view5.getScrollY()));
                                    defpackage.kb.a.a(view, matrix);
                                    defpackage.kb.a.b(viewGroup, matrix);
                                    android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = java.lang.Math.round(rectF.left);
                                    int round2 = java.lang.Math.round(rectF.top);
                                    int round3 = java.lang.Math.round(rectF.right);
                                    int round4 = java.lang.Math.round(rectF.bottom);
                                    android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
                                    imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                                    android.graphics.Bitmap bitmap = null;
                                    int round5 = java.lang.Math.round(rectF.width());
                                    int round6 = java.lang.Math.round(rectF.height());
                                    if (round5 > 0 && round6 > 0) {
                                        float min = java.lang.Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
                                        int i2 = (int) (((float) round5) * min);
                                        int i3 = (int) (((float) round6) * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        bitmap = android.graphics.Bitmap.createBitmap(i2, i3, android.graphics.Bitmap.Config.ARGB_8888);
                                        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                                        canvas.concat(matrix);
                                        view.draw(canvas);
                                    }
                                    if (bitmap != null) {
                                        imageView.setImageBitmap(bitmap);
                                    }
                                    imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view3 = imageView;
                                } else if (view5.getParent() == null) {
                                    int id = view5.getId();
                                    if (id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                            }
                        }
                        view3 = view;
                    }
                } else if (i == 4) {
                    view4 = view2;
                } else {
                    if (view == view2) {
                        view4 = view2;
                    }
                    view3 = view;
                }
                if (view3 != null && jrVar != null) {
                    int[] iArr = (int[]) jrVar.a.get("android:visibility:screenLocation");
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view3.offsetLeftAndRight((i4 - iArr2[0]) - view3.getLeft());
                    view3.offsetTopAndBottom((i5 - iArr2[1]) - view3.getTop());
                    defpackage.ju a = defpackage.jv.a.a(viewGroup);
                    a.a(view3);
                    android.animation.Animator b2 = b(view3, jrVar);
                    if (b2 == null) {
                        a.b(view3);
                        return b2;
                    }
                    b2.addListener(new defpackage.kk(a, view3));
                    return b2;
                } else if (view4 != null) {
                    int visibility = view4.getVisibility();
                    defpackage.kb.a(view4, 0);
                    android.animation.Animator b3 = b(view4, jrVar);
                    if (b3 != null) {
                        defpackage.kl klVar = new defpackage.kl(view4, i);
                        b3.addListener(klVar);
                        defpackage.ib.a.a(b3, klVar);
                        a((defpackage.ji) klVar);
                        return b3;
                    }
                    defpackage.kb.a(view4, visibility);
                    return b3;
                }
            }
            return null;
        } else if ((this.l & 1) != 1 || jrVar2 == null) {
            return null;
        } else {
            if (jrVar == null) {
                android.view.View view6 = (android.view.View) jrVar2.b.getParent();
                if (b(b(view6, false), a(view6, false)).a) {
                    return null;
                }
            }
            return a(jrVar2.b, jrVar);
        }
    }

    public android.animation.Animator a(android.view.View view, defpackage.jr jrVar) {
        return null;
    }

    public android.animation.Animator b(android.view.View view, defpackage.jr jrVar) {
        return null;
    }

    public final boolean a(defpackage.jr jrVar, defpackage.jr jrVar2) {
        if (jrVar == null && jrVar2 == null) {
            return false;
        }
        if (jrVar != null && jrVar2 != null && jrVar2.a.containsKey("android:visibility:visibility") != jrVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        defpackage.km b = b(jrVar, jrVar2);
        if (!b.a) {
            return false;
        }
        if (b.c == 0 || b.d == 0) {
            return true;
        }
        return false;
    }
}
