import ballerina/auth;
import ballerina/http;

function testCreateConfigAuthProvider() returns (auth:ConfigAuthStoreProvider) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider;
}

function testAuthenticationOfNonExistingUser () returns (boolean) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider.authenticate("amila", "abc");
}

function testAuthenticationOfNonExistingPassword () returns (boolean) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider.authenticate("isuru", "xxy");
}

function testAuthentication () returns (boolean) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider.authenticate("isuru", "xxx");
}

function testReadScopesOfNonExistingUser() returns (string[]) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider.getScopes("amila");
}

function testReadScopesOfUser() returns (string[]) {
    auth:ConfigAuthStoreProvider configAuthStoreProvider = new;
    return configAuthStoreProvider.getScopes("ishara");
}

function testDefaultAuthStoreProvider() returns http:Filter {
    endpoint http:SecureListener secureEP {
        port: 9090
    };
    return secureEP.config.filters[1];
}
