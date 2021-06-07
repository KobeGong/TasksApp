package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: kj  reason: default package */
/* compiled from: PG */
public class kj extends je {
    private static final String[] m = {"android:visibility:visibility", "android:visibility:parent"};
    public int l = 3;

    @Override // defpackage.je
    public final String[] a() {
        return m;
    }

    private static void d(jr jrVar) {
        jrVar.a.put("android:visibility:visibility", Integer.valueOf(jrVar.b.getVisibility()));
        jrVar.a.put("android:visibility:parent", jrVar.b.getParent());
        int[] iArr = new int[2];
        jrVar.b.getLocationOnScreen(iArr);
        jrVar.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // defpackage.je
    public void a(jr jrVar) {
        d(jrVar);
    }

    @Override // defpackage.je
    public final void b(jr jrVar) {
        d(jrVar);
    }

    private static km b(jr jrVar, jr jrVar2) {
        km kmVar = new km();
        kmVar.a = false;
        kmVar.b = false;
        if (jrVar == null || !jrVar.a.containsKey("android:visibility:visibility")) {
            kmVar.c = -1;
            kmVar.e = null;
        } else {
            kmVar.c = ((Integer) jrVar.a.get("android:visibility:visibility")).intValue();
            kmVar.e = (ViewGroup) jrVar.a.get("android:visibility:parent");
        }
        if (jrVar2 == null || !jrVar2.a.containsKey("android:visibility:visibility")) {
            kmVar.d = -1;
            kmVar.f = null;
        } else {
            kmVar.d = ((Integer) jrVar2.a.get("android:visibility:visibility")).intValue();
            kmVar.f = (ViewGroup) jrVar2.a.get("android:visibility:parent");
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x00ca */
    @Override // defpackage.je
    public final Animator a(ViewGroup viewGroup, jr jrVar, jr jrVar2) {
        int id;
        km b = b(jrVar, jrVar2);
        if (!b.a || (b.e == null && b.f == null)) {
            return null;
        }
        if (!b.b) {
            int i = b.d;
            if ((this.l & 2) == 2) {
                View view = jrVar != null ? jrVar.b : null;
                View view2 = jrVar2 != null ? jrVar2.b : null;
                View view3 = null;
                View view4 = null;
                if (view2 == null || view2.getParent() == null) {
                    if (view2 != null) {
                        view3 = view2;
                    } else if (view != null) {
                        if (view.getParent() != null) {
                            if (view.getParent() instanceof View) {
                                View view5 = (View) view.getParent();
                                if (!b(a(view5, true), b(view5, true)).a) {
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate((float) (-view5.getScrollX()), (float) (-view5.getScrollY()));
                                    kb.a.a(view, matrix);
                                    kb.a.b(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    Bitmap bitmap = null;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 > 0 && round6 > 0) {
                                        float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        bitmap = Bitmap.createBitmap((int) (((float) round5) * min), (int) (((float) round6) * min), Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmap);
                                        canvas.concat(matrix);
                                        view.draw(canvas);
                                    }
                                    if (bitmap != null) {
                                        imageView.setImageBitmap(bitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view3 = imageView;
                                } else if (view5.getParent() == null && (id = view5.getId()) != -1) {
                                    viewGroup.findViewById(id);
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
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view3.offsetLeftAndRight((i2 - iArr2[0]) - view3.getLeft());
                    view3.offsetTopAndBottom((i3 - iArr2[1]) - view3.getTop());
                    ju a = jv.a.a(viewGroup);
                    a.a(view3);
                    Animator b2 = b(view3, jrVar);
                    if (b2 == null) {
                        a.b(view3);
                        return b2;
                    }
                    b2.addListener(new kk(a, view3));
                    return b2;
                } else if (view4 != null) {
                    int visibility = view4.getVisibility();
                    kb.a(view4, 0);
                    Animator b3 = b(view4, jrVar);
                    if (b3 != null) {
                        kl klVar = new kl(view4, i);
                        b3.addListener(klVar);
                        ib.a.a(b3, klVar);
                        a(klVar);
                        return b3;
                    }
                    kb.a(view4, visibility);
                    return b3;
                }
            }
            return null;
        } else if ((this.l & 1) != 1 || jrVar2 == null) {
            return null;
        } else {
            if (jrVar == null) {
                View view6 = (View) jrVar2.b.getParent();
                if (b(b(view6, false), a(view6, false)).a) {
                    return null;
                }
            }
            return a(jrVar2.b, jrVar);
        }
    }

    public Animator a(View view, jr jrVar) {
        return null;
    }

    public Animator b(View view, jr jrVar) {
        return null;
    }

    @Override // defpackage.je
    public final boolean a(jr jrVar, jr jrVar2) {
        if (jrVar == null && jrVar2 == null) {
            return false;
        }
        if (jrVar != null && jrVar2 != null && jrVar2.a.containsKey("android:visibility:visibility") != jrVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        km b = b(jrVar, jrVar2);
        if (!b.a) {
            return false;
        }
        if (b.c == 0 || b.d == 0) {
            return true;
        }
        return false;
    }
}
