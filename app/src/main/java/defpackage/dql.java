package defpackage;

/* renamed from: dql reason: default package */
/* compiled from: PG */
public final class dql extends defpackage.ehr {
    private java.util.List a;
    private final /* synthetic */ defpackage.dqk b;

    public dql(defpackage.dqk dqk) {
        this.b = dqk;
    }

    public final void a(defpackage.ehp ehp) {
        boolean z = true;
        synchronized (this.b.m.a) {
            defpackage.dqn dqn = this.b.m;
            defpackage.cld.b(dqn.m != null);
            synchronized (dqn.j) {
                if (dqn.l) {
                    z = false;
                }
                defpackage.cld.b(z, (java.lang.Object) "Already allocated");
                dqn.l = true;
            }
            dqn.a();
            this.b.m.c = true;
            defpackage.dqn dqn2 = this.b.m;
            for (defpackage.dqm dqm : dqn2.b) {
                defpackage.dqk dqk = dqn2.h;
                java.nio.ByteBuffer byteBuffer = dqm.a;
                boolean z2 = dqm.b;
                boolean z3 = dqm.c;
                dqk.i.a(byteBuffer, z2);
                if (z3) {
                    dqk.i.b();
                }
            }
            dqn2.b.clear();
        }
    }

    public final void a(defpackage.ehp ehp, defpackage.ejg ejg) {
        a(ejg.b(), false);
        ehp.a(java.nio.ByteBuffer.allocateDirect(4096));
    }

    public final void a(defpackage.ehp ehp, defpackage.ejg ejg, java.nio.ByteBuffer byteBuffer, boolean z) {
        java.lang.String str;
        boolean z2 = true;
        byteBuffer.flip();
        synchronized (this.b.m.a) {
            this.b.m.g = z;
            if (byteBuffer.remaining() != 0) {
                defpackage.dqn dqn = this.b.m;
                dqn.e += byteBuffer.remaining();
                defpackage.dxv a2 = defpackage.dxw.a(byteBuffer);
                if (dqn.s != null) {
                    defpackage.dpw dpw = dqn.s;
                    java.lang.String str2 = "DATA-----------------------------\n";
                    java.lang.String valueOf = java.lang.String.valueOf(defpackage.dxw.a(a2, dqn.u));
                    if (valueOf.length() != 0) {
                        str = str2.concat(valueOf);
                    } else {
                        str = new java.lang.String(str2);
                    }
                    dqn.s = dpw.b(str);
                    a2.close();
                    if (dqn.s.m.length() > 1000) {
                        dqn.a(dqn.s, false, dqn.t);
                    }
                } else if (!dqn.v) {
                    dqn.a(defpackage.dpw.h.a("headers not received before payload"), false, new defpackage.dor());
                } else {
                    defpackage.cld.a((java.lang.Object) a2, (java.lang.Object) "frame");
                    try {
                        if (dqn.q) {
                            defpackage.dqr.o.logp(java.util.logging.Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                            a2.close();
                        } else {
                            try {
                                dqn.i.a(a2);
                            } catch (Throwable th) {
                                th = th;
                                z2 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z2) {
                            a2.close();
                        }
                        throw th;
                    }
                }
            }
        }
        if (z && this.a != null) {
            a(this.a, true);
        }
    }

    public final void b(defpackage.ehp ehp, defpackage.ejg ejg, java.nio.ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        boolean z3 = true;
        synchronized (this.b.m.a) {
            defpackage.dqn dqn = this.b.m;
            int position = byteBuffer.position();
            synchronized (dqn.j) {
                defpackage.cld.b(dqn.l, (java.lang.Object) "onStreamAllocated was not called, but it seems the stream is active");
                boolean z4 = dqn.k < 32768;
                dqn.k -= position;
                if (dqn.k < 32768) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z4 || !z2) {
                    z3 = false;
                }
            }
            if (z3) {
                dqn.a();
            }
        }
    }

    public final void a(defpackage.ehp ehp, defpackage.ejg ejg, defpackage.ejh ejh) {
        boolean z;
        java.util.List list = ejh.a;
        this.a = list;
        synchronized (this.b.m.a) {
            z = this.b.m.g;
        }
        if (z) {
            a(list, true);
        }
    }

    public final void b(defpackage.ehp ehp, defpackage.ejg ejg) {
        if (!a()) {
            if (this.a != null) {
                a(this.a, true);
            } else if (ejg != null) {
                a(ejg.b(), true);
            } else {
                throw new java.lang.AssertionError("No response header or trailer");
            }
        }
        this.b.a(defpackage.dvc.a(ejg.a()));
    }

    public final void a(defpackage.ehp ehp, defpackage.ejg ejg, defpackage.bkv bkv) {
        this.b.a(defpackage.dpw.i.b((java.lang.Throwable) bkv));
    }

    public final void c(defpackage.ehp ehp, defpackage.ejg ejg) {
        defpackage.dpw a2;
        synchronized (this.b.m.a) {
            if (this.b.m.f != null) {
                a2 = this.b.m.f;
            } else if (ejg != null) {
                a2 = defpackage.dvc.a(ejg.a());
            } else {
                a2 = defpackage.dpw.c.a("stream cancelled without reason");
            }
        }
        this.b.a(a2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.util.Map$Entry>, for r11v0, types: [java.util.List, java.util.List<java.util.Map$Entry>] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02be A[Catch:{ all -> 0x0316 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List<java.util.Map.Entry> r11, boolean r12) {
        /*
            r10 = this;
            r3 = 1
            r2 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r11.iterator()
        L_0x000b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r4.add(r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r4.add(r0)
            goto L_0x000b
        L_0x002a:
            int r0 = r4.size()
            byte[][] r5 = new byte[r0][]
            r1 = r2
        L_0x0031:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0063
            java.lang.Object r0 = r4.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)
            byte[] r0 = r0.getBytes(r6)
            r5[r1] = r0
            int r6 = r1 + 1
            int r0 = r1 + 1
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r5[r6] = r0
            int r0 = r1 + 2
            r1 = r0
            goto L_0x0031
        L_0x0063:
            byte[][] r0 = defpackage.dzs.a(r5)
            dor r7 = defpackage.doh.a(r0)
            dqk r0 = r10.b
            dqn r0 = r0.m
            java.lang.Object r8 = r0.a
            monitor-enter(r8)
            dqk r0 = r10.b     // Catch:{ all -> 0x0107 }
            dqn r4 = r0.m     // Catch:{ all -> 0x0107 }
            if (r12 == 0) goto L_0x0140
            java.lang.String r0 = "trailers"
            defpackage.cld.a(r7, r0)     // Catch:{ all -> 0x0107 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0091
            boolean r0 = r4.v     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0091
            dpw r0 = defpackage.dvn.a(r7)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0091
            r4.t = r7     // Catch:{ all -> 0x0107 }
        L_0x0091:
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00c8
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "trailers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            r1 = 0
            dor r2 = r4.t     // Catch:{ all -> 0x0107 }
            r4.a(r0, r1, r2)     // Catch:{ all -> 0x0107 }
        L_0x00c6:
            monitor-exit(r8)     // Catch:{ all -> 0x0107 }
            return
        L_0x00c8:
            doy r0 = defpackage.doi.b     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r7.a(r0)     // Catch:{ all -> 0x0107 }
            dpw r0 = (defpackage.dpw) r0     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x010a
            doy r1 = defpackage.doi.a     // Catch:{ all -> 0x0107 }
            java.lang.Object r1 = r7.a(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.a(r1)     // Catch:{ all -> 0x0107 }
            r6 = r0
        L_0x00df:
            defpackage.dvn.c(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "status"
            defpackage.cld.a(r6, r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "trailers"
            defpackage.cld.a(r7, r0)     // Catch:{ all -> 0x0107 }
            boolean r0 = r4.q     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x013b
            java.util.logging.Logger r0 = defpackage.dqr.o     // Catch:{ all -> 0x0107 }
            java.util.logging.Level r1 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "io.grpc.internal.AbstractClientStream$TransportState"
            java.lang.String r3 = "inboundTrailersReceived"
            java.lang.String r4 = "Received trailers on closed stream:\n {1}\n {2}"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            r9 = 0
            r5[r9] = r6     // Catch:{ all -> 0x0107 }
            r6 = 1
            r5[r6] = r7     // Catch:{ all -> 0x0107 }
            r0.logp(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x0107:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0107 }
            throw r0
        L_0x010a:
            boolean r0 = r4.v     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0118
            dpw r0 = defpackage.dpw.d     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "missing GRPC status in response"
            dpw r0 = r0.a(r1)     // Catch:{ all -> 0x0107 }
            r6 = r0
            goto L_0x00df
        L_0x0118:
            doy r0 = defpackage.dvn.r     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r7.a(r0)     // Catch:{ all -> 0x0107 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0132
            int r0 = r0.intValue()     // Catch:{ all -> 0x0107 }
            dpw r0 = defpackage.dvc.a(r0)     // Catch:{ all -> 0x0107 }
        L_0x012a:
            java.lang.String r1 = "missing GRPC status, inferred error from HTTP status code"
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r6 = r0
            goto L_0x00df
        L_0x0132:
            dpw r0 = defpackage.dpw.h     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "missing HTTP status code"
            dpw r0 = r0.a(r1)     // Catch:{ all -> 0x0107 }
            goto L_0x012a
        L_0x013b:
            r0 = 0
            r4.b(r6, r0, r7)     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x0140:
            java.lang.String r0 = "headers"
            defpackage.cld.a(r7, r0)     // Catch:{ all -> 0x0107 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0174
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "headers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x0174:
            boolean r0 = r4.v     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x01b9
            dpw r0 = defpackage.dpw.h     // Catch:{ all -> 0x0316 }
            java.lang.String r1 = "Received headers twice"
            dpw r0 = r0.a(r1)     // Catch:{ all -> 0x0316 }
            r4.s = r0     // Catch:{ all -> 0x0316 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00c6
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "headers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            r4.t = r7     // Catch:{ all -> 0x0107 }
            java.nio.charset.Charset r0 = defpackage.dvn.b(r7)     // Catch:{ all -> 0x0107 }
            r4.u = r0     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x01b9:
            doy r0 = defpackage.dvn.r     // Catch:{ all -> 0x0316 }
            java.lang.Object r0 = r7.a(r0)     // Catch:{ all -> 0x0316 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x020a
            int r1 = r0.intValue()     // Catch:{ all -> 0x0316 }
            r5 = 100
            if (r1 < r5) goto L_0x020a
            int r0 = r0.intValue()     // Catch:{ all -> 0x0316 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 >= r1) goto L_0x020a
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00c6
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "headers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            r4.t = r7     // Catch:{ all -> 0x0107 }
            java.nio.charset.Charset r0 = defpackage.dvn.b(r7)     // Catch:{ all -> 0x0107 }
            r4.u = r0     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x020a:
            r0 = 1
            r4.v = r0     // Catch:{ all -> 0x0316 }
            dpw r0 = defpackage.dvn.a(r7)     // Catch:{ all -> 0x0316 }
            r4.s = r0     // Catch:{ all -> 0x0316 }
            dpw r0 = r4.s     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x024e
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00c6
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "headers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            r4.t = r7     // Catch:{ all -> 0x0107 }
            java.nio.charset.Charset r0 = defpackage.dvn.b(r7)     // Catch:{ all -> 0x0107 }
            r4.u = r0     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x024e:
            defpackage.dvn.c(r7)     // Catch:{ all -> 0x0316 }
            boolean r0 = r4.q     // Catch:{ all -> 0x0316 }
            if (r0 != 0) goto L_0x02f1
            r0 = r3
        L_0x0256:
            java.lang.String r1 = "Received headers on closed stream"
            defpackage.cld.b(r0, r1)     // Catch:{ all -> 0x0316 }
            doy r0 = defpackage.dvc.e     // Catch:{ all -> 0x0316 }
            java.lang.Object r0 = r7.a(r0)     // Catch:{ all -> 0x0316 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0316 }
            boolean r1 = r4.n     // Catch:{ all -> 0x0316 }
            if (r1 == 0) goto L_0x0287
            if (r0 == 0) goto L_0x0287
            java.lang.String r1 = "gzip"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0316 }
            if (r1 == 0) goto L_0x02f4
            dvk r0 = new dvk     // Catch:{ all -> 0x0316 }
            r0.<init>()     // Catch:{ all -> 0x0316 }
            dtl r1 = r4.i     // Catch:{ all -> 0x0316 }
            r1.a(r0)     // Catch:{ all -> 0x0316 }
            dqz r1 = new dqz     // Catch:{ all -> 0x0316 }
            dtl r0 = r4.i     // Catch:{ all -> 0x0316 }
            dxd r0 = (defpackage.dxd) r0     // Catch:{ all -> 0x0316 }
            r1.<init>(r4, r4, r0)     // Catch:{ all -> 0x0316 }
            r4.i = r1     // Catch:{ all -> 0x0316 }
            r2 = r3
        L_0x0287:
            doy r0 = defpackage.dvc.c     // Catch:{ all -> 0x0316 }
            java.lang.Object r0 = r7.a(r0)     // Catch:{ all -> 0x0316 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0316 }
            if (r0 == 0) goto L_0x0373
            dob r1 = r4.o     // Catch:{ all -> 0x0316 }
            java.util.Map r1 = r1.b     // Catch:{ all -> 0x0316 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0316 }
            doc r1 = (defpackage.doc) r1     // Catch:{ all -> 0x0316 }
            if (r1 == 0) goto L_0x034d
            doa r1 = r1.a     // Catch:{ all -> 0x0316 }
        L_0x029f:
            if (r1 != 0) goto L_0x0350
            dpw r1 = defpackage.dpw.h     // Catch:{ all -> 0x0316 }
            java.lang.String r2 = "Can't find decompressor for %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0316 }
            r5 = 0
            r3[r5] = r0     // Catch:{ all -> 0x0316 }
            java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0316 }
            dpw r0 = r1.a(r0)     // Catch:{ all -> 0x0316 }
            dqb r0 = r0.b()     // Catch:{ all -> 0x0316 }
            r4.a(r0)     // Catch:{ all -> 0x0316 }
        L_0x02ba:
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00c6
            dpw r0 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r2 = r2.length()     // Catch:{ all -> 0x0107 }
            int r2 = r2 + 9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r3.<init>(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "headers: "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0107 }
            dpw r0 = r0.b(r1)     // Catch:{ all -> 0x0107 }
            r4.s = r0     // Catch:{ all -> 0x0107 }
            r4.t = r7     // Catch:{ all -> 0x0107 }
            java.nio.charset.Charset r0 = defpackage.dvn.b(r7)     // Catch:{ all -> 0x0107 }
            r4.u = r0     // Catch:{ all -> 0x0107 }
            goto L_0x00c6
        L_0x02f1:
            r0 = r2
            goto L_0x0256
        L_0x02f4:
            java.lang.String r1 = "identity"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0316 }
            if (r1 != 0) goto L_0x0287
            dpw r1 = defpackage.dpw.h     // Catch:{ all -> 0x0316 }
            java.lang.String r2 = "Can't find full stream decompressor for %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0316 }
            r5 = 0
            r3[r5] = r0     // Catch:{ all -> 0x0316 }
            java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0316 }
            dpw r0 = r1.a(r0)     // Catch:{ all -> 0x0316 }
            dqb r0 = r0.b()     // Catch:{ all -> 0x0316 }
            r4.a(r0)     // Catch:{ all -> 0x0316 }
            goto L_0x02ba
        L_0x0316:
            r0 = move-exception
            dpw r1 = r4.s     // Catch:{ all -> 0x0107 }
            if (r1 == 0) goto L_0x034c
            dpw r1 = r4.s     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0107 }
            int r3 = r3.length()     // Catch:{ all -> 0x0107 }
            int r3 = r3 + 9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r5.<init>(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "headers: "
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0107 }
            dpw r1 = r1.b(r2)     // Catch:{ all -> 0x0107 }
            r4.s = r1     // Catch:{ all -> 0x0107 }
            r4.t = r7     // Catch:{ all -> 0x0107 }
            java.nio.charset.Charset r1 = defpackage.dvn.b(r7)     // Catch:{ all -> 0x0107 }
            r4.u = r1     // Catch:{ all -> 0x0107 }
        L_0x034c:
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x034d:
            r1 = 0
            goto L_0x029f
        L_0x0350:
            doa r0 = defpackage.dno.a     // Catch:{ all -> 0x0316 }
            if (r1 == r0) goto L_0x0373
            if (r2 == 0) goto L_0x036e
            dpw r0 = defpackage.dpw.h     // Catch:{ all -> 0x0316 }
            java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0316 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x0316 }
            dpw r0 = r0.a(r1)     // Catch:{ all -> 0x0316 }
            dqb r0 = r0.b()     // Catch:{ all -> 0x0316 }
            r4.a(r0)     // Catch:{ all -> 0x0316 }
            goto L_0x02ba
        L_0x036e:
            dtl r0 = r4.i     // Catch:{ all -> 0x0316 }
            r0.a(r1)     // Catch:{ all -> 0x0316 }
        L_0x0373:
            dzq r0 = r4.m     // Catch:{ all -> 0x0316 }
            r0.a(r7)     // Catch:{ all -> 0x0316 }
            goto L_0x02ba
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dql.a(java.util.List, boolean):void");
    }

    private final boolean a() {
        boolean z;
        synchronized (this.b.m.a) {
            z = this.a != null && this.b.m.g;
        }
        return z;
    }
}
