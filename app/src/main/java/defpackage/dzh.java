package defpackage;

/* renamed from: dzh reason: default package */
/* compiled from: PG */
final class dzh {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dzh.class.getName());
    private static final java.util.Set b = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    private dzh() {
    }

    static java.lang.String a(java.util.Map map) {
        java.lang.String str = "loadBalancingPolicy";
        if (map.containsKey(str)) {
            return d(map, str);
        }
        return null;
    }

    static defpackage.dyt a(java.util.Map map, int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (map != null) {
            if (map.containsKey("methodConfig")) {
                java.util.List a2 = a(map, "methodConfig");
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= a2.size()) {
                        break;
                    }
                    java.util.Map a3 = a(a2, i3);
                    if (a3.containsKey("retryPolicy")) {
                        java.util.Map b2 = b(a3, "retryPolicy");
                        int min = java.lang.Math.min(c(b2, "maxAttempts").intValue(), i);
                        java.lang.String d = d(b2, "initialBackoff");
                        defpackage.cld.b(d.charAt(d.length() + -1) == 's', (java.lang.Object) "invalid value of initialBackoff");
                        double parseDouble = java.lang.Double.parseDouble(d.substring(0, d.length() - 1));
                        java.lang.String d2 = d(b2, "maxBackoff");
                        defpackage.cld.b(d2.charAt(d2.length() + -1) == 's', (java.lang.Object) "invalid value of maxBackoff");
                        double parseDouble2 = java.lang.Double.parseDouble(d2.substring(0, d2.length() - 1));
                        double doubleValue = c(b2, "backoffMultiplier").doubleValue();
                        java.util.List a4 = a(b2, "retryableStatusCodes");
                        java.util.HashSet hashSet = new java.util.HashSet(a4.size());
                        for (int i4 = 0; i4 < a4.size(); i4++) {
                            hashSet.add(defpackage.dpx.a(b(a4, i4)));
                        }
                        defpackage.dyu dyu = new defpackage.dyu(min, parseDouble, parseDouble2, doubleValue, hashSet);
                        java.util.List a5 = a(a3, "name");
                        for (int i5 = 0; i5 < a5.size(); i5++) {
                            java.util.Map a6 = a(a5, i5);
                            java.lang.String d3 = d(a6, "service");
                            if (a6.containsKey("method")) {
                                hashMap.put(defpackage.dpb.a(d3, d(a6, "method")), dyu);
                            } else {
                                hashMap2.put(d3, dyu);
                            }
                        }
                    }
                    i2 = i3 + 1;
                }
            }
        }
        return new defpackage.dyt(hashMap, hashMap2);
    }

    static defpackage.dzb b(java.util.Map map) {
        boolean z;
        boolean z2 = true;
        java.lang.String str = "retryThrottling";
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        java.util.Map b2 = b(map, str);
        float floatValue = c(b2, "maxTokens").floatValue();
        float floatValue2 = c(b2, "tokenRatio").floatValue();
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z2 = false;
        }
        defpackage.cld.b(z2, (java.lang.Object) "tokenRatio should be greater than zero");
        return new defpackage.dzb(floatValue, floatValue2);
    }

    static java.util.Map a(java.util.Map map, java.util.Random random, java.lang.String str) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.cky.a(b.contains(entry.getKey()), "Bad key: %s", (java.lang.Object) entry);
        }
        if (map.containsKey("clientLanguage")) {
            java.util.List a2 = a(map, "clientLanguage");
            if (!a2.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= a2.size()) {
                        z2 = false;
                        break;
                    }
                    if ("java".equals(b(a2, i).toLowerCase(java.util.Locale.ROOT))) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
                if (!z2) {
                    return null;
                }
            }
        }
        if (map.containsKey("percentage")) {
            int intValue = c(map, "percentage").intValue();
            if (intValue < 0 || intValue > 100) {
                z = false;
            } else {
                z = true;
            }
            defpackage.cky.a(z, "Bad percentage", map.get("percentage"));
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        if (map.containsKey("clientHostname")) {
            java.util.List a3 = a(map, "clientHostname");
            if (!a3.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a3.size()) {
                        z3 = false;
                        break;
                    } else if (b(a3, i2).equals(str)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z3) {
                    return null;
                }
            }
        }
        return b(map, "serviceConfig");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r11v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List a(java.util.List<java.lang.String> r11) {
        /*
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r11.iterator()
        L_0x0009:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r9.next()
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = "_grpc_config="
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto L_0x00b8
            r1 = 13
            java.lang.String r1 = r7.substring(r1)     // Catch:{ IOException -> 0x0053 }
            java.lang.Object r2 = defpackage.dwb.a(r1)     // Catch:{ IOException -> 0x0053 }
            boolean r1 = r2 instanceof java.util.List     // Catch:{ IOException -> 0x0053 }
            if (r1 != 0) goto L_0x0070
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0053 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0053 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0053 }
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = "wrong type"
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0053 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0053 }
            throw r1     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            r6 = move-exception
            java.util.logging.Logger r1 = a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "io.grpc.internal.ServiceConfigUtil"
            java.lang.String r4 = "parseTxtResults"
            java.lang.String r10 = "Bad service config: "
            java.lang.String r5 = java.lang.String.valueOf(r7)
            int r7 = r5.length()
            if (r7 == 0) goto L_0x00ad
            java.lang.String r5 = r10.concat(r5)
        L_0x006c:
            r1.logp(r2, r3, r4, r5, r6)
            goto L_0x0009
        L_0x0070:
            r0 = r2
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x0053 }
            r1 = r0
            java.util.Iterator r3 = r1.iterator()     // Catch:{ IOException -> 0x0053 }
        L_0x0078:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0053 }
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0053 }
            boolean r4 = r4 instanceof java.util.Map     // Catch:{ IOException -> 0x0053 }
            if (r4 != 0) goto L_0x0078
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0053 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0053 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0053 }
            int r3 = r3 + 18
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = "wrong element type"
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0053 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0053 }
            throw r1     // Catch:{ IOException -> 0x0053 }
        L_0x00ad:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r10)
            goto L_0x006c
        L_0x00b3:
            r8.addAll(r1)
            goto L_0x0009
        L_0x00b8:
            java.util.logging.Logger r1 = a
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.lang.String r3 = "io.grpc.internal.ServiceConfigUtil"
            java.lang.String r4 = "parseTxtResults"
            java.lang.String r5 = "Ignoring non service config {0}"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r10 = 0
            r6[r10] = r7
            r1.logp(r2, r3, r4, r5, r6)
            goto L_0x0009
        L_0x00cd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzh.a(java.util.List):java.util.List");
    }

    private static java.util.List a(java.util.Map map, java.lang.String str) {
        java.lang.Object a2 = defpackage.cld.a(map.get(str), "no such key %s", (java.lang.Object) str);
        if (a2 instanceof java.util.List) {
            return (java.util.List) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for key %s in %s is not List", new java.lang.Object[]{a2, str, map}));
    }

    private static java.util.Map b(java.util.Map map, java.lang.String str) {
        java.lang.Object a2 = defpackage.cld.a(map.get(str), "no such key %s", (java.lang.Object) str);
        if (a2 instanceof java.util.Map) {
            return (java.util.Map) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for key %s in %s is not object", new java.lang.Object[]{a2, str, map}));
    }

    private static java.util.Map a(java.util.List list, int i) {
        java.lang.Object a2 = defpackage.cld.a(list.get(i), "idx %s in %s is null", i, (java.lang.Object) list);
        if (a2 instanceof java.util.Map) {
            return (java.util.Map) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for idx %d in %s is not a map", new java.lang.Object[]{a2, java.lang.Integer.valueOf(i), list}));
    }

    private static java.lang.Double c(java.util.Map map, java.lang.String str) {
        java.lang.Object a2 = defpackage.cld.a(map.get(str), "no such key %s", (java.lang.Object) str);
        if (a2 instanceof java.lang.Double) {
            return (java.lang.Double) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for key %s in %s is not Double", new java.lang.Object[]{a2, str, map}));
    }

    private static java.lang.String d(java.util.Map map, java.lang.String str) {
        java.lang.Object a2 = defpackage.cld.a(map.get(str), "no such key %s", (java.lang.Object) str);
        if (a2 instanceof java.lang.String) {
            return (java.lang.String) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for key %s in %s is not String", new java.lang.Object[]{a2, str, map}));
    }

    private static java.lang.String b(java.util.List list, int i) {
        java.lang.Object a2 = defpackage.cld.a(list.get(i), "idx %s in %s is null", i, (java.lang.Object) list);
        if (a2 instanceof java.lang.String) {
            return (java.lang.String) a2;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value %s for idx %d in %s is not String", new java.lang.Object[]{a2, java.lang.Integer.valueOf(i), list}));
    }
}
