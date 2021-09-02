package defpackage;

/* renamed from: dih reason: default package */
/* compiled from: PG */
public abstract class dih extends defpackage.dgo {
    public static java.util.Map t = new java.util.concurrent.ConcurrentHashMap();
    private int a = -1;
    public defpackage.dky s = defpackage.dky.a;

    public abstract java.lang.Object a(int i);

    public final defpackage.djx d() {
        return (defpackage.djx) a(defpackage.bg.aq);
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ").append(obj);
        defpackage.dgv.a((defpackage.djo) this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.r != 0) {
            return this.r;
        }
        this.r = defpackage.djz.a.a((java.lang.Object) this).a(this);
        return this.r;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((defpackage.dih) a(defpackage.bg.ap)).getClass().isInstance(obj)) {
            return false;
        }
        return defpackage.djz.a.a((java.lang.Object) this).a((java.lang.Object) this, (java.lang.Object) (defpackage.dih) obj);
    }

    public final boolean e() {
        boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
        byte byteValue = ((java.lang.Byte) a(defpackage.bg.ak)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = defpackage.djz.a.a((java.lang.Object) this).d(this);
        if (!booleanValue) {
            return d;
        }
        a(defpackage.bg.al);
        return d;
    }

    /* access modifiers changed from: 0000 */
    public final int c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        this.a = i;
    }

    public final void a(defpackage.dhn dhn) {
        defpackage.dlt dlt;
        defpackage.dkh a2 = defpackage.djz.a.a(getClass());
        if (dhn.b != null) {
            dlt = dhn.b;
        } else {
            dlt = new defpackage.dlt(dhn);
        }
        a2.a((java.lang.Object) this, dlt);
    }

    public final int f() {
        if (this.a == -1) {
            this.a = defpackage.djz.a.a((java.lang.Object) this).b(this);
        }
        return this.a;
    }

    static defpackage.dih a(java.lang.Class cls) {
        defpackage.dih dih = (defpackage.dih) t.get(cls);
        if (dih == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                dih = (defpackage.dih) t.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (dih != null) {
            return dih;
        }
        java.lang.String str = "Unable to get default instance for: ";
        java.lang.String valueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
    }

    static java.lang.Object a(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            } else if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            } else {
                throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final boolean a(defpackage.dih dih, boolean z) {
        byte byteValue = ((java.lang.Byte) dih.a(defpackage.bg.ak)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = defpackage.djz.a.a((java.lang.Object) dih).d(dih);
        if (!z) {
            return d;
        }
        dih.a(defpackage.bg.al);
        return d;
    }

    static defpackage.dih a(defpackage.dih dih, defpackage.dhj dhj, defpackage.dhw dhw) {
        defpackage.dih dih2 = (defpackage.dih) dih.a(defpackage.bg.an);
        try {
            defpackage.djz.a.a((java.lang.Object) dih2).a(dih2, defpackage.dhm.a(dhj), dhw);
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            return dih2;
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof defpackage.dir) {
                throw ((defpackage.dir) e.getCause());
            }
            throw new defpackage.dir(e.getMessage());
        } catch (java.lang.RuntimeException e2) {
            if (e2.getCause() instanceof defpackage.dir) {
                throw ((defpackage.dir) e2.getCause());
            }
            throw e2;
        }
    }

    private static defpackage.dih b(defpackage.dih dih, byte[] bArr) {
        defpackage.dih dih2 = (defpackage.dih) dih.a(defpackage.bg.an);
        try {
            defpackage.djz.a.a((java.lang.Object) dih2).a(dih2, bArr, 0, bArr.length, new defpackage.dgw());
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            if (dih2.r == 0) {
                return dih2;
            }
            throw new java.lang.RuntimeException();
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof defpackage.dir) {
                throw ((defpackage.dir) e.getCause());
            }
            throw new defpackage.dir(e.getMessage());
        } catch (java.lang.IndexOutOfBoundsException e2) {
            defpackage.dir a2 = defpackage.dir.a();
            if (a2 == null) {
                throw null;
            }
            throw a2;
        }
    }

    public static defpackage.dih a(defpackage.dih dih, defpackage.dha dha) {
        boolean d;
        boolean d2;
        defpackage.dih a2 = a(dih, dha, defpackage.dhw.a());
        if (a2 != null) {
            boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
            byte byteValue = ((java.lang.Byte) a2.a(defpackage.bg.ak)).byteValue();
            if (byteValue == 1) {
                d2 = true;
            } else if (byteValue == 0) {
                d2 = false;
            } else {
                d2 = defpackage.djz.a.a((java.lang.Object) a2).d(a2);
                if (booleanValue) {
                    a2.a(defpackage.bg.al);
                }
            }
            if (!d2) {
                defpackage.dir a3 = new defpackage.dkw().a();
                if (a3 == null) {
                    throw null;
                }
                throw a3;
            }
        }
        if (a2 != null) {
            boolean booleanValue2 = java.lang.Boolean.TRUE.booleanValue();
            byte byteValue2 = ((java.lang.Byte) a2.a(defpackage.bg.ak)).byteValue();
            if (byteValue2 == 1) {
                d = true;
            } else if (byteValue2 == 0) {
                d = false;
            } else {
                d = defpackage.djz.a.a((java.lang.Object) a2).d(a2);
                if (booleanValue2) {
                    a2.a(defpackage.bg.al);
                }
            }
            if (!d) {
                defpackage.dir a4 = new defpackage.dkw().a();
                if (a4 == null) {
                    throw null;
                }
                throw a4;
            }
        }
        return a2;
    }

    private static defpackage.dih a(defpackage.dih dih, defpackage.dha dha, defpackage.dhw dhw) {
        try {
            defpackage.dhj e = dha.e();
            defpackage.dih a2 = a(dih, e, dhw);
            e.a(0);
            return a2;
        } catch (defpackage.dir e2) {
            throw e2;
        } catch (defpackage.dir e3) {
            throw e3;
        }
    }

    public static defpackage.dih a(defpackage.dih dih, byte[] bArr) {
        boolean d;
        defpackage.dih b = b(dih, bArr);
        if (b != null) {
            boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
            byte byteValue = ((java.lang.Byte) b.a(defpackage.bg.ak)).byteValue();
            if (byteValue == 1) {
                d = true;
            } else if (byteValue == 0) {
                d = false;
            } else {
                d = defpackage.djz.a.a((java.lang.Object) b).d(b);
                if (booleanValue) {
                    b.a(defpackage.bg.al);
                }
            }
            if (!d) {
                defpackage.dir a2 = new defpackage.dkw().a();
                if (a2 == null) {
                    throw null;
                }
                throw a2;
            }
        }
        return b;
    }

    public final /* synthetic */ defpackage.djp g() {
        defpackage.dii dii = (defpackage.dii) a(defpackage.bg.ao);
        dii.a(this);
        return dii;
    }

    public final /* synthetic */ defpackage.djp h() {
        return (defpackage.dii) a(defpackage.bg.ao);
    }

    public final /* synthetic */ defpackage.djo i() {
        return (defpackage.dih) a(defpackage.bg.ap);
    }
}
