package org.chromium.net;

import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class AndroidKeyStore {
    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                return instance.sign();
            } catch (Exception e) {
                dpt.c("AndroidKeyStore", "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            dpt.c("AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e2, new Object[0]);
            return null;
        }
    }

    private static Object a(PrivateKey privateKey) {
        if (privateKey == null) {
            dpt.c("AndroidKeyStore", "privateKey == null", new Object[0]);
            return null;
        } else if (!(privateKey instanceof RSAPrivateKey)) {
            dpt.c("AndroidKeyStore", "does not implement RSAPrivateKey", new Object[0]);
            return null;
        } else {
            try {
                Class<?> cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (!cls.isInstance(privateKey)) {
                    dpt.c("AndroidKeyStore", "Private key is not an OpenSSLRSAPrivateKey instance, its class name is:" + privateKey.getClass().getCanonicalName(), new Object[0]);
                    return null;
                }
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                    declaredMethod.setAccessible(true);
                    try {
                        Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                        if (invoke != null) {
                            return invoke;
                        }
                        dpt.c("AndroidKeyStore", "getOpenSSLKey() returned null", new Object[0]);
                        return null;
                    } finally {
                        declaredMethod.setAccessible(false);
                    }
                } catch (Exception e) {
                    dpt.c("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                dpt.c("AndroidKeyStore", "Cannot find system OpenSSLRSAPrivateKey class: " + e2, new Object[0]);
                return null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @CalledByNative
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        Object a = a(privateKey);
        if (a == null) {
            return 0;
        }
        try {
            Method declaredMethod = a.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                try {
                    long longValue = ((Number) declaredMethod.invoke(a, new Object[0])).longValue();
                    declaredMethod.setAccessible(false);
                    if (longValue != 0) {
                        return longValue;
                    }
                    dpt.c("AndroidKeyStore", "getPkeyContext() returned null", new Object[0]);
                    return longValue;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                    throw th;
                }
            } catch (Exception e) {
                dpt.c("AndroidKeyStore", "Exception while trying to retrieve system EVP_PKEY handle: " + e, new Object[0]);
                return 0;
            }
        } catch (Exception e2) {
            dpt.c("AndroidKeyStore", "No getPkeyContext() method on OpenSSLKey member:" + e2, new Object[0]);
            return 0;
        }
    }

    @CalledByNative
    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        try {
            Class<?> cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object a = a(privateKey);
            if (a == null) {
                return null;
            }
            try {
                Method declaredMethod = a.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    try {
                        Object invoke = declaredMethod.invoke(a, new Object[0]);
                        if (invoke == null) {
                            dpt.c("AndroidKeyStore", "getEngine() returned null", new Object[0]);
                        }
                        if (cls.isInstance(invoke)) {
                            return invoke;
                        }
                        dpt.c("AndroidKeyStore", "Engine is not an OpenSSLEngine instance, its class name is:" + invoke.getClass().getCanonicalName(), new Object[0]);
                        return null;
                    } finally {
                        declaredMethod.setAccessible(false);
                    }
                } catch (Exception e) {
                    dpt.c("AndroidKeyStore", "Exception while trying to retrieve OpenSSLEngine object: " + e, new Object[0]);
                    return null;
                }
            } catch (Exception e2) {
                dpt.c("AndroidKeyStore", "No getEngine() method on OpenSSLKey member:" + e2, new Object[0]);
                return null;
            }
        } catch (Exception e3) {
            dpt.c("AndroidKeyStore", "Cannot find system OpenSSLEngine class: " + e3, new Object[0]);
            return null;
        }
    }
}
