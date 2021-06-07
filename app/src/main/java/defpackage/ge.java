package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ge  reason: default package */
/* compiled from: PG */
public final class ge {
    public float a;
    public float b;
    private final List c = new ArrayList();

    public ge() {
        a();
    }

    public final void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c.clear();
    }

    public final void a(float f) {
        gg ggVar = new gg();
        ggVar.a = f;
        this.c.add(ggVar);
        this.a = f;
        this.b = 0.0f;
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        gf gfVar = new gf(f, f2, f3, f4);
        gfVar.a = f5;
        gfVar.b = f6;
        this.c.add(gfVar);
        this.a = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians((double) (f5 + f6)))));
        this.b = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians((double) (f5 + f6)))));
    }

    public final void a(Matrix matrix, Path path) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((gh) this.c.get(i)).a(matrix, path);
        }
    }
}
