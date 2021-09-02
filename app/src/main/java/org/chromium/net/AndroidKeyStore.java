package org.chromium.net;

/* compiled from: PG */
public class AndroidKeyStore {
    @org.chromium.base.annotations.CalledByNative
    private static byte[] signWithPrivateKey(java.security.PrivateKey privateKey, java.lang.String str, byte[] bArr) {
        byte[] bArr2 = null;
        try {
            java.security.Signature instance = java.security.Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                return instance.sign();
            } catch (java.lang.Exception e) {
                defpackage.dpt.c("AndroidKeyStore", "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e, new java.lang.Object[0]);
                return bArr2;
            }
        } catch (java.security.NoSuchAlgorithmException e2) {
            defpackage.dpt.c("AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e2, new java.lang.Object[0]);
            return bArr2;
        }
    }

    private static java.lang.Object a(java.security.PrivateKey privateKey) {
        java.lang.reflect.Method declaredMethod;
        if (privateKey == null) {
            defpackage.dpt.c("AndroidKeyStore", "privateKey == null", new java.lang.Object[0]);
            return null;
        } else if (!(privateKey instanceof java.security.interfaces.RSAPrivateKey)) {
            defpackage.dpt.c("AndroidKeyStore", "does not implement RSAPrivateKey", new java.lang.Object[0]);
            return null;
        } else {
            try {
                java.lang.Class cls = java.lang.Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (!cls.isInstance(privateKey)) {
                    defpackage.dpt.c("AndroidKeyStore", "Private key is not an OpenSSLRSAPrivateKey instance, its class name is:" + privateKey.getClass().getCanonicalName(), new java.lang.Object[0]);
                    return null;
                }
                try {
                    declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    java.lang.Object invoke = declaredMethod.invoke(privateKey, new java.lang.Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke != null) {
                        return invoke;
                    }
                    defpackage.dpt.c("AndroidKeyStore", "getOpenSSLKey() returned null", new java.lang.Object[0]);
                    return null;
                } catch (java.lang.Exception e) {
                    defpackage.dpt.c("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new java.lang.Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                defpackage.dpt.c("AndroidKeyStore", "Cannot find system OpenSSLRSAPrivateKey class: " + e2, new java.lang.Object[0]);
                return null;
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static long getOpenSSLHandleForPrivateKey(java.security.PrivateKey privateKey) {
        java.lang.Object a = a(privateKey);
        if (a == null) {
            return 0;
        }
        try {
            java.lang.reflect.Method declaredMethod = a.getClass().getDeclaredMethod("getPkeyContext", new java.lang.Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((java.lang.Number) declaredMethod.invoke(a, new java.lang.Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue != 0) {
                    return longValue;
                }
                defpackage.dpt.c("AndroidKeyStore", "getPkeyContext() returned null", new java.lang.Object[0]);
                return longValue;
            } catch (java.lang.Exception e) {
                defpackage.dpt.c("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new java.lang.Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
                throw th;
            }
        } catch (java.lang.Exception e2) {
            defpackage.dpt.c("AndroidKeyStore", "No getPkeyContext() method on OpenSSLKey member:" + e2, new java.lang.Object[0]);
            return 0;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.Object getOpenSSLEngineForPrivateKey(java.security.PrivateKey privateKey) {
        try {
            java.lang.Class cls = java.lang.Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            java.lang.Object a = a(privateKey);
            if (a == null) {
                return null;
            }
            try {
                java.lang.reflect.Method declaredMethod = a.getClass().getDeclaredMethod("getEngine", new java.lang.Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    java.lang.Object invoke = declaredMethod.invoke(a, new java.lang.Object[0]);
                    declaredMethod.setAccessible(false);
                    if (invoke == null) {
                        defpackage.dpt.c("AndroidKeyStore", "getEngine() returned null", new java.lang.Object[0]);
                    }
                    if (cls.isInstance(invoke)) {
                        return invoke;
                    }
                    defpackage.dpt.c("AndroidKeyStore", "Engine is not an OpenSSLEngine instance, its class name is:" + invoke.getClass().getCanonicalName(), new java.lang.Object[0]);
                    return null;
                } catch (java.lang.Exception e) {
                    defpackage.dpt.c("AndroidKeyStore", "Exception while trying to retrieve OpenSSLEngine object: " + e, new java.lang.Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                defpackage.dpt.c("AndroidKeyStore", "No getEngine() method on OpenSSLKey member:" + e2, new java.lang.Object[0]);
                return null;
            }
        } catch (java.lang.Exception e3) {
            defpackage.dpt.c("AndroidKeyStore", "Cannot find system OpenSSLEngine class: " + e3, new java.lang.Object[0]);
            return null;
        }
    }
}
