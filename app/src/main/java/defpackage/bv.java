package defpackage;

/* renamed from: bv reason: default package */
/* compiled from: PG */
public final class bv {
    private static final int[] b = {0, 4, 8};
    private static android.util.SparseIntArray c;
    public java.util.HashMap a = new java.util.HashMap();

    private static int a(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static void a(defpackage.bw bwVar, android.content.res.TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (c.get(index)) {
                case 1:
                    bwVar.p = a(typedArray, index, bwVar.p);
                    break;
                case 2:
                    bwVar.D = typedArray.getDimensionPixelSize(index, bwVar.D);
                    break;
                case 3:
                    bwVar.o = a(typedArray, index, bwVar.o);
                    break;
                case 4:
                    bwVar.n = a(typedArray, index, bwVar.n);
                    break;
                case 5:
                    bwVar.w = typedArray.getString(index);
                    break;
                case 6:
                    bwVar.x = typedArray.getDimensionPixelOffset(index, bwVar.x);
                    break;
                case 7:
                    bwVar.y = typedArray.getDimensionPixelOffset(index, bwVar.y);
                    break;
                case 8:
                    bwVar.E = typedArray.getDimensionPixelSize(index, bwVar.E);
                    break;
                case 9:
                    bwVar.n = a(typedArray, index, bwVar.t);
                    break;
                case 10:
                    bwVar.s = a(typedArray, index, bwVar.s);
                    break;
                case 11:
                    bwVar.K = typedArray.getDimensionPixelSize(index, bwVar.K);
                    break;
                case 12:
                    bwVar.L = typedArray.getDimensionPixelSize(index, bwVar.L);
                    break;
                case 13:
                    bwVar.H = typedArray.getDimensionPixelSize(index, bwVar.H);
                    break;
                case 14:
                    bwVar.J = typedArray.getDimensionPixelSize(index, bwVar.J);
                    break;
                case 15:
                    bwVar.M = typedArray.getDimensionPixelSize(index, bwVar.M);
                    break;
                case 16:
                    bwVar.I = typedArray.getDimensionPixelSize(index, bwVar.I);
                    break;
                case 17:
                    bwVar.e = typedArray.getDimensionPixelOffset(index, bwVar.e);
                    break;
                case 18:
                    bwVar.f = typedArray.getDimensionPixelOffset(index, bwVar.f);
                    break;
                case 19:
                    bwVar.g = typedArray.getFloat(index, bwVar.g);
                    break;
                case 20:
                    bwVar.u = typedArray.getFloat(index, bwVar.u);
                    break;
                case 21:
                    bwVar.c = typedArray.getLayoutDimension(index, bwVar.c);
                    break;
                case 22:
                    bwVar.G = typedArray.getInt(index, bwVar.G);
                    bwVar.G = b[bwVar.G];
                    break;
                case 23:
                    bwVar.b = typedArray.getLayoutDimension(index, bwVar.b);
                    break;
                case 24:
                    bwVar.A = typedArray.getDimensionPixelSize(index, bwVar.A);
                    break;
                case 25:
                    bwVar.h = a(typedArray, index, bwVar.h);
                    break;
                case 26:
                    bwVar.i = a(typedArray, index, bwVar.i);
                    break;
                case 27:
                    bwVar.z = typedArray.getInt(index, bwVar.z);
                    break;
                case 28:
                    bwVar.B = typedArray.getDimensionPixelSize(index, bwVar.B);
                    break;
                case 29:
                    bwVar.j = a(typedArray, index, bwVar.j);
                    break;
                case 30:
                    bwVar.k = a(typedArray, index, bwVar.k);
                    break;
                case 31:
                    bwVar.F = typedArray.getDimensionPixelSize(index, bwVar.F);
                    break;
                case 32:
                    bwVar.q = a(typedArray, index, bwVar.q);
                    break;
                case 33:
                    bwVar.r = a(typedArray, index, bwVar.r);
                    break;
                case 34:
                    bwVar.C = typedArray.getDimensionPixelSize(index, bwVar.C);
                    break;
                case 35:
                    bwVar.m = a(typedArray, index, bwVar.m);
                    break;
                case 36:
                    bwVar.l = a(typedArray, index, bwVar.l);
                    break;
                case 37:
                    bwVar.v = typedArray.getFloat(index, bwVar.v);
                    break;
                case 38:
                    bwVar.d = typedArray.getResourceId(index, bwVar.d);
                    break;
                case 39:
                    bwVar.O = typedArray.getFloat(index, bwVar.O);
                    break;
                case 40:
                    bwVar.N = typedArray.getFloat(index, bwVar.N);
                    break;
                case 41:
                    bwVar.P = typedArray.getInt(index, bwVar.P);
                    break;
                case 42:
                    bwVar.Q = typedArray.getInt(index, bwVar.Q);
                    break;
                case 43:
                    bwVar.R = typedArray.getFloat(index, bwVar.R);
                    break;
                case 44:
                    bwVar.S = true;
                    bwVar.T = typedArray.getFloat(index, bwVar.T);
                    break;
                case 45:
                    bwVar.U = typedArray.getFloat(index, bwVar.U);
                    break;
                case 46:
                    bwVar.V = typedArray.getFloat(index, bwVar.V);
                    break;
                case 47:
                    bwVar.W = typedArray.getFloat(index, bwVar.W);
                    break;
                case 48:
                    bwVar.X = typedArray.getFloat(index, bwVar.X);
                    break;
                case 49:
                    bwVar.Y = typedArray.getFloat(index, bwVar.Y);
                    break;
                case 50:
                    bwVar.Z = typedArray.getFloat(index, bwVar.Z);
                    break;
                case 51:
                    bwVar.aa = typedArray.getFloat(index, bwVar.aa);
                    break;
                case 52:
                    bwVar.ab = typedArray.getFloat(index, bwVar.ab);
                    break;
                case 53:
                    bwVar.ac = typedArray.getFloat(index, bwVar.ac);
                    break;
                case 60:
                    android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + c.get(index));
                    break;
                default:
                    android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + c.get(index));
                    break;
            }
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(defpackage.by.aK, 25);
        c.append(defpackage.by.aL, 26);
        c.append(defpackage.by.aN, 29);
        c.append(defpackage.by.aO, 30);
        c.append(defpackage.by.aT, 36);
        c.append(defpackage.by.aS, 35);
        c.append(defpackage.by.aw, 4);
        c.append(defpackage.by.av, 3);
        c.append(defpackage.by.at, 1);
        c.append(defpackage.by.ba, 6);
        c.append(defpackage.by.bb, 7);
        c.append(defpackage.by.aA, 17);
        c.append(defpackage.by.aB, 18);
        c.append(defpackage.by.aC, 19);
        c.append(defpackage.by.ah, 27);
        c.append(defpackage.by.aP, 32);
        c.append(defpackage.by.aQ, 33);
        c.append(defpackage.by.az, 10);
        c.append(defpackage.by.ay, 9);
        c.append(defpackage.by.be, 13);
        c.append(defpackage.by.bh, 16);
        c.append(defpackage.by.bf, 14);
        c.append(defpackage.by.bc, 11);
        c.append(defpackage.by.bg, 15);
        c.append(defpackage.by.bd, 12);
        c.append(defpackage.by.aW, 40);
        c.append(defpackage.by.aI, 39);
        c.append(defpackage.by.aH, 41);
        c.append(defpackage.by.aV, 42);
        c.append(defpackage.by.aG, 20);
        c.append(defpackage.by.aU, 37);
        c.append(defpackage.by.ax, 5);
        c.append(defpackage.by.aJ, 60);
        c.append(defpackage.by.aR, 60);
        c.append(defpackage.by.aM, 60);
        c.append(defpackage.by.au, 60);
        c.append(defpackage.by.as, 60);
        c.append(defpackage.by.ac, 24);
        c.append(defpackage.by.ad, 28);
        c.append(defpackage.by.ae, 31);
        c.append(defpackage.by.ab, 8);
        c.append(defpackage.by.af, 34);
        c.append(defpackage.by.aa, 2);
        c.append(defpackage.by.ag, 23);
        c.append(defpackage.by.Z, 21);
        c.append(defpackage.by.ar, 22);
        c.append(defpackage.by.W, 43);
        c.append(defpackage.by.X, 44);
        c.append(defpackage.by.ai, 45);
        c.append(defpackage.by.aj, 46);
        c.append(defpackage.by.ak, 47);
        c.append(defpackage.by.al, 48);
        c.append(defpackage.by.am, 49);
        c.append(defpackage.by.an, 50);
        c.append(defpackage.by.ao, 51);
        c.append(defpackage.by.ap, 52);
        c.append(defpackage.by.aq, 53);
        c.append(defpackage.by.aX, 54);
        c.append(defpackage.by.aD, 55);
        c.append(defpackage.by.aY, 56);
        c.append(defpackage.by.aE, 57);
        c.append(defpackage.by.aZ, 58);
        c.append(defpackage.by.aF, 59);
        c.append(defpackage.by.Y, 38);
    }
}
