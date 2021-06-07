package defpackage;

import android.os.Debug;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: cno  reason: default package */
/* compiled from: PG */
public final class cno extends Thread {
    public final ReferenceQueue a;
    public File b;
    public final cnl c;
    public final cnl d;
    private final cnm e;
    private final Deque f = new ArrayDeque(20);
    private final Deque g = new ArrayDeque(3);

    cno(ReferenceQueue referenceQueue, cnp cnp, cnm cnm) {
        setName("Primes-Watcher");
        this.a = referenceQueue;
        this.e = cnm;
        this.c = new cnl("Sentinel", "Sentinel", referenceQueue);
        this.d = new cnl("Sentinel", "Sentinel", referenceQueue);
        for (int i = 0; i < 20; i++) {
            this.f.add(new Object());
        }
        for (int i2 = 0; i2 < 3; i2++) {
            this.g.add(new cnl("Sentinel", "Sentinel", referenceQueue));
        }
    }

    public final void run() {
        int i;
        boolean z;
        while (!isInterrupted()) {
            try {
                Thread.sleep(5000);
                Object poll = this.f.poll();
                this.f.offer(new Object());
                Object a2 = cnp.a(poll, "", this.a);
                boolean z2 = false;
                while (!z2) {
                    Object obj = null;
                    while (obj == null) {
                        try {
                            obj = this.a.remove();
                        } catch (InterruptedException e2) {
                            if (this.b != null) {
                                a();
                            } else {
                                throw e2;
                            }
                        }
                    }
                    Object obj2 = obj;
                    boolean z3 = z2;
                    while (obj2 != null) {
                        if (obj2 == a2) {
                            cky.b(!z3, "Only one dummy released at a time.");
                            z = true;
                        } else {
                            String a3 = a((cnl) obj2);
                            cnm cnm = this.e;
                            cia cia = (cia) cnm.a.get(a3);
                            if (cia == null) {
                                cia = new cia();
                                cnm.a.put(a3, cia);
                            }
                            cia.a++;
                            z = z3;
                        }
                        z3 = z;
                        obj2 = this.a.poll();
                    }
                    if (!z3) {
                        this.e.a(false);
                    }
                    z2 = z3;
                }
                cnl cnl = (cnl) this.g.poll();
                boolean z4 = cnl.c != null;
                int i2 = 0;
                for (cnl cnl2 = this.d.c; cnl2 != null; cnl2 = cnl2.c) {
                    i2++;
                }
                while (cnl.c != null) {
                    cnl a4 = cnl.c.a();
                    cnm cnm2 = this.e;
                    String str = a4.a;
                    cia cia2 = (cia) cnm2.a.get(str);
                    if (cia2 == null) {
                        cia2 = new cia();
                        cnm2.a.put(str, cia2);
                    }
                    cia2.b++;
                    if (i2 < 500) {
                        a4.a(this.d);
                        i = i2 + 1;
                    } else {
                        i = i2;
                    }
                    i2 = i;
                }
                this.g.offer(cnl);
                synchronized (this.c) {
                    if (this.c.c != null) {
                        cnl.c = this.c.c;
                        cnl.c.b = cnl;
                        this.c.c = null;
                    }
                }
                this.e.a(z4);
            } catch (InterruptedException e3) {
                interrupt();
                if (this.b != null) {
                    interrupted();
                    a();
                }
            }
        }
        synchronized (this.c) {
            this.c.c = null;
        }
        this.f.clear();
        this.g.clear();
    }

    private final String a(cnl cnl) {
        if (cnl.b == this.c) {
            synchronized (this.c) {
                cnl.a();
            }
        } else {
            cnl.a();
        }
        return cnl.a;
    }

    private final void a() {
        List<String> emptyList;
        int i;
        int[] copyOf;
        int[] copyOf2;
        int[] copyOf3;
        int[] copyOf4;
        int i2;
        Object obj;
        cky.b(this.b != null);
        if (this.b.exists()) {
            cdm.a(3, "LeakWatcherThread", "Abort dumping heap because heapdump file %s exists", this.b.getName());
            this.b = null;
            return;
        }
        cnl cnl = new cnl("Sentinel", "Sentinel", this.a);
        synchronized (this.c) {
            cnl.a(this.c);
            this.c.c = null;
            cnl.b = null;
        }
        try {
            System.nanoTime();
            Debug.dumpHprofData(this.b.getAbsolutePath());
            System.nanoTime();
            cmt cmt = new cmt(this.b);
            String name = cnl.class.getName();
            cnc a2 = cnc.a(cmt.c);
            cmy cmy = new cmy(a2, cmt.b, cmt.a, Collections.singleton(name));
            while (cmy.b.hasRemaining()) {
                byte b2 = cmy.b.get();
                cmy.b.getInt();
                if (cmy.b.getInt(cmy.b.position()) >= 0) {
                    switch (b2) {
                        case 1:
                            int position = cmy.b.position();
                            int i3 = cmy.b.getInt();
                            cmy.c.a(cmy.a.a(), position);
                            cmy.a.c(i3 - cmy.a.b);
                            break;
                        case 2:
                            cmy.b.getInt();
                            cmy.b.getInt();
                            int position2 = cmy.b.position();
                            int a3 = cmy.a.a();
                            cmy.b.getInt();
                            int b3 = cmy.c.b(cmy.a.a());
                            cmv cmv = new cmv(position2, b3);
                            cmy.e.a(a3, cmv);
                            cnc cnc = cmy.a;
                            int i4 = cnc.a.getInt(b3) - cnc.b;
                            int i5 = cmy.a.b + b3 + 4;
                            cni cni = cmy.m;
                            ByteBuffer byteBuffer = cmy.b;
                            int i6 = i4 + i5;
                            cnj cnj = cni.a;
                            int i7 = i5;
                            while (true) {
                                if (i7 < i6) {
                                    byte b4 = byteBuffer.get(i7);
                                    if (cnj.b == null || (cnj = (cnj) cnj.b.a(b4)) == null) {
                                        obj = null;
                                    } else {
                                        i7++;
                                    }
                                } else {
                                    obj = cnj.a;
                                }
                            }
                            obj = null;
                            cmz cmz = (cmz) obj;
                            if (cmz != cmz.IDENTIFY_OBJECT_CLASS) {
                                if (cmz != cmz.CLASSIFY_REF) {
                                    if (cmz != null) {
                                        cmy.k.a(a3, cmz);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    cmv.j |= 2;
                                    break;
                                }
                            } else {
                                cmy.i = a3;
                                break;
                            }
                        case 12:
                        case 28:
                            int position3 = cmy.b.position() + cmy.b.getInt();
                            while (cmy.b.position() < position3) {
                                int i8 = cmy.b.get() & 255;
                                if (cmy.a.c.c(i8)) {
                                    int b5 = cmy.a.c.b(i8);
                                    if (cmy.h.c(i8)) {
                                        cmy.a.c(b5);
                                    } else {
                                        cmy.d.a(cmy.a.a(), i8);
                                        cmy.a.c(b5 - cmy.a.b);
                                    }
                                } else {
                                    switch (i8) {
                                        case 32:
                                            int a4 = cmy.a.a();
                                            if (a4 == cmy.i) {
                                                cmv cmv2 = (cmv) cmy.e.a(a4);
                                                cnc cnc2 = cmy.a;
                                                cng cng = cmy.e;
                                                ByteBuffer byteBuffer2 = cnc2.a;
                                                cmv2.h = byteBuffer2.position() - cnc2.b;
                                                byteBuffer2.getInt();
                                                cmv2.f = (cmv) cng.a(cnc2.a());
                                                cnc2.c((cnc2.b * 5) + 4);
                                                cmv.c(cnc2);
                                                ByteBuffer byteBuffer3 = cnc2.a;
                                                int i9 = 65535 & byteBuffer3.getShort();
                                                for (int i10 = 0; i10 < i9; i10++) {
                                                    cnc2.a();
                                                    cnc2.c(cnc2.b(byteBuffer3.get()));
                                                }
                                                cmv2.a = new int[0];
                                                cmv2.b = new int[0];
                                                ByteBuffer byteBuffer4 = cnc2.a;
                                                int i11 = 65535 & byteBuffer4.getShort();
                                                cmv2.e = 0;
                                                for (int i12 = 0; i12 < i11; i12++) {
                                                    cnc2.a();
                                                    cmv2.e = cnc2.b(byteBuffer4.get()) + cmv2.e;
                                                }
                                                cmv2.c = new int[0];
                                                cmv2.d = new int[0];
                                                break;
                                            } else {
                                                cmv cmv3 = (cmv) cmy.e.a(a4);
                                                cnc cnc3 = cmy.a;
                                                cng cng2 = cmy.e;
                                                cne cne = cmy.c;
                                                ByteBuffer byteBuffer5 = cnc3.a;
                                                cmv3.h = byteBuffer5.position() - cnc3.b;
                                                byteBuffer5.getInt();
                                                cmv3.f = (cmv) cng2.a(cnc3.a());
                                                cnc3.c(cnc3.b * 5);
                                                byteBuffer5.getInt();
                                                cmv.c(cnc3);
                                                ByteBuffer byteBuffer6 = cnc3.a;
                                                int i13 = byteBuffer6.getShort() & 65535;
                                                cmv3.a = new int[i13];
                                                cmv3.b = new int[i13];
                                                int i14 = 0;
                                                for (int i15 = 0; i15 < i13; i15++) {
                                                    int a5 = cnc3.a();
                                                    byte b6 = byteBuffer6.get();
                                                    if (cnc.e(b6)) {
                                                        int a6 = cnc3.a();
                                                        if (a6 != 0) {
                                                            cmv3.a[i14] = a6;
                                                            cmv3.b[i14] = cne.b(a5);
                                                            i14++;
                                                        }
                                                    } else {
                                                        cnc3.c(cnc3.b(b6));
                                                    }
                                                }
                                                if (i14 == i13) {
                                                    copyOf = cmv3.a;
                                                } else {
                                                    copyOf = Arrays.copyOf(cmv3.a, i14);
                                                }
                                                cmv3.a = copyOf;
                                                if (i14 == i13) {
                                                    copyOf2 = cmv3.b;
                                                } else {
                                                    copyOf2 = Arrays.copyOf(cmv3.b, i14);
                                                }
                                                cmv3.b = copyOf2;
                                                ByteBuffer byteBuffer7 = cnc3.a;
                                                int i16 = byteBuffer7.getShort() & 65535;
                                                cmv3.c = new int[i16];
                                                cmv3.d = new int[i16];
                                                int i17 = 0;
                                                cmv3.e = 0;
                                                int i18 = 0;
                                                while (i18 < i16) {
                                                    int a7 = cnc3.a();
                                                    byte b7 = byteBuffer7.get();
                                                    if (cnc.e(b7)) {
                                                        cmv3.c[i17] = cne.b(a7);
                                                        cmv3.d[i17] = cmv3.e;
                                                        i2 = i17 + 1;
                                                    } else {
                                                        i2 = i17;
                                                    }
                                                    cmv3.e += cnc3.b(b7);
                                                    i18++;
                                                    i17 = i2;
                                                }
                                                if (i17 == i16) {
                                                    copyOf3 = cmv3.c;
                                                } else {
                                                    copyOf3 = Arrays.copyOf(cmv3.c, i17);
                                                }
                                                cmv3.c = copyOf3;
                                                if (i17 == i16) {
                                                    copyOf4 = cmv3.d;
                                                } else {
                                                    copyOf4 = Arrays.copyOf(cmv3.d, i17);
                                                }
                                                cmv3.d = copyOf4;
                                                break;
                                            }
                                        case 33:
                                            int position4 = cmy.b.position();
                                            int a8 = cmy.a.a();
                                            cmy.b.getInt();
                                            int a9 = cmy.a.a();
                                            int i19 = cmy.b.getInt();
                                            cmv cmv4 = (cmv) cmy.e.a(a9);
                                            cmz cmz2 = (cmz) cmy.k.a(a9);
                                            if (!(cmv4 == null || cmz2 == cmz.EXCLUDE_INSTANCE)) {
                                                cmw cmw = new cmw(position4, cmv4);
                                                cmy.f.a(a8, cmw);
                                                if (cmz2 == cmz.FIND_INSTANCE) {
                                                    String b8 = cmv4.b(cmy.a);
                                                    List list = (List) cmy.g.get(b8);
                                                    if (list == null) {
                                                        list = new ArrayList();
                                                        cmy.g.put(b8, list);
                                                    }
                                                    list.add(cmw);
                                                }
                                            }
                                            cmy.a.c(i19);
                                            break;
                                        case 34:
                                            int position5 = cmy.b.position();
                                            int a10 = cmy.a.a();
                                            cmy.b.getInt();
                                            int i20 = cmy.b.getInt();
                                            int a11 = cmy.a.a();
                                            cmz cmz3 = (cmz) cmy.k.a(a11);
                                            Object a12 = cmy.e.a(a11);
                                            if (((a12 == null || a12 == cng.a) ? false : true) && cmz3 != cmz.EXCLUDE_INSTANCE) {
                                                cmy.f.a(a10, new cmu(position5, (cmv) cmy.e.a(a11)));
                                            }
                                            cmy.a.c(cmy.a.b * i20);
                                            break;
                                        case 35:
                                        case 195:
                                            int position6 = cmy.b.position();
                                            int a13 = cmy.a.a();
                                            cmy.b.getInt();
                                            int i21 = cmy.b.getInt();
                                            byte b9 = cmy.b.get();
                                            cmz cmz4 = (cmz) cmy.l.a(b9);
                                            cmy.a.c(i21 * cmy.a.b(b9));
                                            if (cmz4 != cmz.EXCLUDE_INSTANCE) {
                                                cmy.f.a(a13, new cna(position6));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 254:
                                            cmy.b.getInt();
                                            cmy.j = cmy.a.a(cmy.c.b(cmy.a.a()));
                                            break;
                                        default:
                                            throw new IllegalArgumentException(new StringBuilder(23).append("Unknown tag ").append(i8).toString());
                                    }
                                }
                            }
                            cky.b(cmy.b.position() == position3);
                            break;
                        default:
                            cmy.a.c(cmy.b.getInt());
                            break;
                    }
                } else {
                    throw new RuntimeException("Length too large to parse.");
                }
            }
            cng cng3 = cmy.e;
            cnh cnh = new cnh(cng3.b, cng3.c);
            while (true) {
                cnh.c = null;
                while (true) {
                    if ((cnh.c == null || cnh.c == cng.a) && cnh.b < cnh.a.length) {
                        Object[] objArr = cnh.a;
                        int i22 = cnh.b;
                        cnh.b = i22 + 1;
                        cnh.c = objArr[i22];
                    }
                }
                if ((cnh.c == null || cnh.c == cng.a) ? false : true) {
                    ((cmv) cnh.c).a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    cne cne2 = cmy.d;
                    cnf cnf = new cnf(cne2.c, cne2.d, cne2.b);
                    while (true) {
                        cnf.f = cnf.c;
                        while (cnf.f == cnf.c && cnf.d < cnf.b.length) {
                            int[] iArr = cnf.b;
                            int i23 = cnf.d;
                            cnf.d = i23 + 1;
                            cnf.f = iArr[i23];
                        }
                        if (cnf.d > 0) {
                            cnf.e = cnf.a[cnf.d - 1];
                        }
                        if (cnf.f != cnf.c) {
                            int i24 = cnf.e;
                            cmx cmx = (cmx) cmy.e.a(i24);
                            if (cmx != null || (cmx = (cmx) cmy.f.a(i24)) != null) {
                                cmx.j |= 1;
                                arrayList.add(cmx);
                            }
                        } else {
                            cmy.c.a();
                            cmy.k.a();
                            cnd cnd = new cnd(cmy.e, cmy.f, arrayList, cmy.g);
                            List<cmx> list2 = (List) cnd.d.get(name);
                            ArrayList arrayList2 = new ArrayList();
                            if (list2 != null) {
                                for (cmx cmx2 : list2) {
                                    cky.a((Object) "referent");
                                    int a14 = cmx2.a(a2);
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= a14) {
                                            i = 0;
                                        } else if ("referent".equals(cmx2.b(a2, i25))) {
                                            i = cmx2.a(a2, i25);
                                        } else {
                                            i25++;
                                        }
                                    }
                                    cmx cmx3 = (cmx) cnd.b.a(i);
                                    if (cmx3 != null) {
                                        arrayList2.add(cmx3);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                for (cmx cmx4 : cnd.c) {
                                    if (!cky.a(cmx4)) {
                                        arrayDeque.addLast(cmx4);
                                    }
                                }
                                cng cng4 = cnd.b;
                                cng cng5 = cnd.a;
                                while (!arrayDeque.isEmpty()) {
                                    cmx cmx5 = (cmx) arrayDeque.removeFirst();
                                    int a15 = cmx5.a(a2);
                                    for (int i26 = 0; i26 < a15; i26++) {
                                        int a16 = cmx5.a(a2, i26);
                                        cmx cmx6 = (cmx) cng4.a(a16);
                                        if (cmx6 == null) {
                                            cmx6 = (cmx) cng5.a(a16);
                                        }
                                        if (cmx6 != null && cmx6.i == null && (cmx6.j & 1) == 0 && !cky.a(cmx6)) {
                                            cmx6.i = cmx5;
                                            arrayDeque.addLast(cmx6);
                                        }
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = arrayList2;
                                int size = arrayList4.size();
                                int i27 = 0;
                                while (i27 < size) {
                                    Object obj2 = arrayList4.get(i27);
                                    i27++;
                                    cmx cmx7 = (cmx) obj2;
                                    if (cmx7.i != null && (cmx7 instanceof cmw)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(cmx7.c(a2, -1));
                                        while (cmx7.i != null) {
                                            sb.append('\n');
                                            cmx cmx8 = cmx7.i;
                                            int d2 = a2.d(cmx7.h);
                                            int a17 = cmx8.a(a2);
                                            int i28 = 0;
                                            while (true) {
                                                if (i28 >= a17) {
                                                    i28 = -1;
                                                } else if (d2 != cmx8.a(a2, i28)) {
                                                    i28++;
                                                }
                                            }
                                            sb.append(cmx7.i.c(a2, i28));
                                            cmx7 = cmx7.i;
                                        }
                                        arrayList3.add(sb.toString());
                                    }
                                }
                                emptyList = arrayList3;
                            } else {
                                emptyList = Collections.emptyList();
                            }
                            if (!emptyList.isEmpty()) {
                                cnm cnm = this.e;
                                ArrayList arrayList5 = new ArrayList();
                                for (String str : emptyList) {
                                    eet eet = new eet();
                                    int indexOf = str.indexOf(10);
                                    eet.a = indexOf < 0 ? str : str.substring(0, indexOf);
                                    eet.d = str;
                                    eet.c = 1;
                                    arrayList5.add(eet);
                                }
                                if (!arrayList5.isEmpty()) {
                                    efx efx = new efx();
                                    efx.n = new eel();
                                    efx.n.a = (eet[]) arrayList5.toArray(new eet[arrayList5.size()]);
                                    if (cnm.b.b()) {
                                        cnm.b.a(efx);
                                    }
                                }
                                if (!emptyList.isEmpty()) {
                                    cdm.a(2, "MemoryLeakService", "Primes found %d leak(s): %s", Integer.valueOf(emptyList.size()), emptyList);
                                }
                            }
                            for (cnl cnl2 : this.g) {
                                cnl2.a();
                            }
                            this.d.a();
                            File file = this.b;
                            this.b = null;
                            file.delete();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            File file2 = this.b;
            this.b = null;
            file2.delete();
            throw th;
        }
    }
}
