package defpackage;

/* renamed from: dur reason: default package */
/* compiled from: PG */
final class dur extends defpackage.dup {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("\\s+");

    dur() {
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dus a(java.lang.String str) {
        java.util.List list;
        java.util.List list2;
        java.lang.String str2;
        java.util.List emptyList = java.util.Collections.emptyList();
        java.lang.String str3 = "_grpc_config.";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.String str4 = valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3);
        if (defpackage.dum.a.isLoggable(java.util.logging.Level.FINER)) {
            defpackage.dum.a.logp(java.util.logging.Level.FINER, "io.grpc.internal.DnsNameResolver$JndiResolver", "resolve", "About to query TXT records for {0}", new java.lang.Object[]{str4});
        }
        java.lang.String str5 = "TXT";
        java.lang.String str6 = "dns:///";
        try {
            java.lang.String valueOf2 = java.lang.String.valueOf(str4);
            emptyList = a(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new java.lang.String(str6));
        } catch (javax.naming.NamingException e) {
            if (defpackage.dum.a.isLoggable(java.util.logging.Level.FINE)) {
                java.util.logging.Logger logger = defpackage.dum.a;
                java.util.logging.Level level = java.util.logging.Level.FINE;
                java.lang.String str7 = "io.grpc.internal.DnsNameResolver$JndiResolver";
                java.lang.String str8 = "resolve";
                java.lang.String str9 = "Unable to look up ";
                java.lang.String valueOf3 = java.lang.String.valueOf(str4);
                logger.logp(level, str7, str8, valueOf3.length() != 0 ? str9.concat(valueOf3) : new java.lang.String(str9), e);
            }
        }
        java.lang.String str10 = "_grpclb._tcp.";
        java.lang.String valueOf4 = java.lang.String.valueOf(str);
        java.lang.String str11 = valueOf4.length() != 0 ? str10.concat(valueOf4) : new java.lang.String(str10);
        if (defpackage.dum.a.isLoggable(java.util.logging.Level.FINER)) {
            defpackage.dum.a.logp(java.util.logging.Level.FINER, "io.grpc.internal.DnsNameResolver$JndiResolver", "resolve", "About to query SRV records for {0}", new java.lang.Object[]{str11});
        }
        java.util.List emptyList2 = java.util.Collections.emptyList();
        java.lang.String str12 = "SRV";
        java.lang.String str13 = "dns:///";
        try {
            java.lang.String valueOf5 = java.lang.String.valueOf(str11);
            if (valueOf5.length() != 0) {
                str2 = str13.concat(valueOf5);
            } else {
                str2 = new java.lang.String(str13);
            }
            java.util.List<java.lang.String> a2 = a(str12, str2);
            list2 = new java.util.ArrayList(a2.size());
            try {
                for (java.lang.String str14 : a2) {
                    try {
                        java.lang.String[] split = a.split(str14);
                        defpackage.cky.a(split.length == 4, "Bad SRV Record: %s, ", (java.lang.Object) str14);
                        java.lang.String str15 = split[3];
                        int parseInt = java.lang.Integer.parseInt(split[2]);
                        java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str15);
                        java.util.ArrayList arrayList = new java.util.ArrayList(allByName.length);
                        for (java.net.InetAddress inetSocketAddress : allByName) {
                            arrayList.add(new java.net.InetSocketAddress(inetSocketAddress, parseInt));
                        }
                        list2.add(new defpackage.doe(java.util.Collections.unmodifiableList(arrayList), defpackage.dmv.a().a(defpackage.dvb.b, str15).a()));
                    } catch (java.net.UnknownHostException e2) {
                        java.util.logging.Logger logger2 = defpackage.dum.a;
                        java.util.logging.Level level2 = java.util.logging.Level.WARNING;
                        java.lang.String str16 = "io.grpc.internal.DnsNameResolver$JndiResolver";
                        java.lang.String str17 = "resolve";
                        java.lang.String str18 = "Can't find address for SRV record";
                        java.lang.String valueOf6 = java.lang.String.valueOf(str14);
                        logger2.logp(level2, str16, str17, valueOf6.length() != 0 ? str18.concat(valueOf6) : new java.lang.String(str18), e2);
                    } catch (java.lang.RuntimeException e3) {
                        java.util.logging.Logger logger3 = defpackage.dum.a;
                        java.util.logging.Level level3 = java.util.logging.Level.WARNING;
                        java.lang.String str19 = "io.grpc.internal.DnsNameResolver$JndiResolver";
                        java.lang.String str20 = "resolve";
                        java.lang.String str21 = "Failed to construct SRV record";
                        java.lang.String valueOf7 = java.lang.String.valueOf(str14);
                        logger3.logp(level3, str19, str20, valueOf7.length() != 0 ? str21.concat(valueOf7) : new java.lang.String(str21), e3);
                    }
                }
                list = list2;
            } catch (javax.naming.NamingException e4) {
                e = e4;
                if (defpackage.dum.a.isLoggable(java.util.logging.Level.FINE)) {
                    java.util.logging.Logger logger4 = defpackage.dum.a;
                    java.util.logging.Level level4 = java.util.logging.Level.FINE;
                    java.lang.String str22 = "io.grpc.internal.DnsNameResolver$JndiResolver";
                    java.lang.String str23 = "resolve";
                    java.lang.String str24 = "Unable to look up ";
                    java.lang.String valueOf8 = java.lang.String.valueOf(str4);
                    logger4.logp(level4, str22, str23, valueOf8.length() != 0 ? str24.concat(valueOf8) : new java.lang.String(str24), e);
                }
                list = list2;
                return new defpackage.dus(java.util.Collections.emptyList(), emptyList, java.util.Collections.unmodifiableList(list));
            }
        } catch (javax.naming.NamingException e5) {
            e = e5;
            list2 = emptyList2;
        }
        return new defpackage.dus(java.util.Collections.emptyList(), emptyList, java.util.Collections.unmodifiableList(list));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.lang.String r4, java.lang.String r5) {
        /*
            javax.naming.directory.InitialDirContext r0 = new javax.naming.directory.InitialDirContext
            r0.<init>()
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            javax.naming.directory.Attributes r0 = r0.getAttributes(r5, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            javax.naming.NamingEnumeration r2 = r0.getAll()
        L_0x0018:
            boolean r0 = r2.hasMore()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0043 }
            javax.naming.directory.Attribute r0 = (javax.naming.directory.Attribute) r0     // Catch:{ all -> 0x0043 }
            javax.naming.NamingEnumeration r3 = r0.getAll()     // Catch:{ all -> 0x0043 }
        L_0x0028:
            boolean r0 = r3.hasMore()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x003e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = defpackage.dum.a(r0)     // Catch:{ all -> 0x003e }
            r1.add(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0028
        L_0x003e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x0048:
            r3.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0018
        L_0x004c:
            r2.close()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.a(java.lang.String, java.lang.String):java.util.List");
    }
}
