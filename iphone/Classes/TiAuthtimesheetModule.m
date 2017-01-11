/**
 * authtimesheet
 *
 * Created by Your Name
 * Copyright (c) 2017 Your Company. All rights reserved.
 */

#import "TiAuthtimesheetModule.h"
#import "TiBase.h"
#import "TiApp.h"
#import "TiHost.h"
#import "TiUtils.h"
#import <objc/runtime.h>

#undef USE_TI_APPIOS
#define USE_TI_APPIOS 1

@implementation TiApp (Branch)

bool applicationOpenURLSourceApplication(id self, SEL _cmd, UIApplication* application, NSURL* url, NSString* sourceApplication, id annotation) {
    NSLog(@"[INFO] applicationOpenURLSourceApplication");
    
    if (![[GIDSignIn sharedInstance] handleURL:url
                            sourceApplication:sourceApplication
                                   annotation:annotation]) {
        return applicationOpenURLSourceApplication(self, _cmd, application, url, sourceApplication, annotation);
    }
    
    return YES;
}

bool applicationOpenURLOptions(id self, SEL _cmd, UIApplication* application, NSURL* url, NSDictionary<NSString *,id> * options){
    NSLog(@"[INFO] applicationOpenURLOptions");
    if(![[GIDSignIn sharedInstance] handleURL:url
                            sourceApplication:options[UIApplicationOpenURLOptionsSourceApplicationKey]
                                   annotation:options[UIApplicationOpenURLOptionsAnnotationKey]]){
        return applicationOpenURLOptions(self, _cmd, application, url, options);
    }
    return YES;	
}
@end

@interface TiAuthtimesheetModule () <GIDSignInDelegate, GIDSignInUIDelegate>
    @property (strong, nonatomic) KrollCallback* onSuccess;
    @property (strong, nonatomic) KrollCallback* onPresent;
    @property (strong, nonatomic) KrollCallback* onDissmiss;
@end

@implementation TiAuthtimesheetModule

#pragma mark Internal

// this is generated for your module, please do not change it
-(id)moduleGUID
{
	return @"02318f5c-d417-45ff-a30b-fd1be3e1b77e";
}

// this is generated for your module, please do not change it
-(NSString*)moduleId
{
	return @"ti.authtimesheet";
}

#pragma mark Lifecycle

-(void)startup
{
	// this method is called when the module is first loaded
	// you *must* call the superclass
	[super startup];

	NSLog(@"[INFO] %@ loaded",self);
    
    id delegate = [[UIApplication sharedApplication] delegate];
//    Class objectClass = object_getClass(delegate);
    
//    NSString *newClassName = @"MyTiApp%@";
//    Class modDelegate = NSClassFromString(newClassName);
    
//    if (modDelegate == nil) {
//        modDelegate = objc_allocateClassPair(objectClass, [newClassName UTF8String], 0);
//        
//        // original delegate's selectors
//        SEL selectorToOverride1 = @selector(application:openURL:sourceApplication:annotation:);
//        
//        Method m1 = class_getInstanceMethod(objectClass, selectorToOverride1);
//        
//        // our method to switch implementation with the original delegate's
//        SEL selectorToUse1 = @selector(applicationOpenURLSourceApplication:);
//        Method u1 = class_getInstanceMethod(objectClass, selectorToUse1);
//        
//        // switch implemention of openURL method
//        method_exchangeImplementations(m1, u1);
//        
//        
//        
//        objc_registerClassPair(modDelegate);
//    }
    object_setClass(delegate, objc_getClass("MyTiApp"));
    
}

-(void)shutdown:(id)sender
{
	// this method is called when the module is being unloaded
	// typically this is during shutdown. make sure you don't do too
	// much processing here or the app will be quit forceably

	// you *must* call the superclass
	[super shutdown:sender];
}

#pragma mark Cleanup

-(void)dealloc
{
	// release any resources that have been retained by the module
	[super dealloc];
}

#pragma mark Internal Memory Management

-(void)didReceiveMemoryWarning:(NSNotification*)notification
{
	// optionally release any resources that can be dynamically
	// reloaded once memory is available - such as caches
	[super didReceiveMemoryWarning:notification];
}

#pragma mark Listener Notifications

-(void)_listenerAdded:(NSString *)type count:(int)count
{
	if (count == 1 && [type isEqualToString:@"my_event"])
	{
		// the first (of potentially many) listener is being added
		// for event named 'my_event'
	}
}

-(void)_listenerRemoved:(NSString *)type count:(int)count
{
	if (count == 0 && [type isEqualToString:@"my_event"])
	{
		// the last listener called for event named 'my_event' has
		// been removed, we can optionally clean up any resources
		// since no body is listening at this point for that event
	}
}

-(void)createSignin:(id)args
{
    
    NSLog(@"[INFO] create Signin");
    self.onSuccess = [args objectAtIndex:2];
    GIDSignIn *signin = [GIDSignIn sharedInstance];
    signin.shouldFetchBasicProfile = true;
    signin.clientID = [args objectAtIndex:0];
    signin.serverClientID = [args objectAtIndex:1];
    signin.scopes = @[ @"https://www.googleapis.com/auth/userinfo.profile", @"https://www.googleapis.com/auth/userinfo.email", @"https://www.googleapis.com/auth/drive"];
    signin.delegate = self;
    signin.uiDelegate = self;
}

-(void)swizzlingTiAppHandleUrl:(id)args
{
//    NSLog(@"[INFO] swizzling");
//    object_setClass([TiApp app], objc_getClass("MyTiApp"));
    
//    Method originalNewerMethod= class_getInstanceMethod([[TiApp app] class],@selector(TiApp:application:openURL:optinos:));
//    Method optionalNewerMethod = class_getInstanceMethod([self class], @selector(application:openURL:options:));
//    method_exchangeImplementations(originalNewerMethod, optionalNewerMethod);
//    
//    Method originalOlderMethod= class_getInstanceMethod([[TiApp app] class],@selector(TiApp:application:openURL:sourceApplication:annotation:));
//    Method optionalOlderMethod = class_getInstanceMethod([self class], @selector(application:openURL:sourceApplication:annotation:));
//    method_exchangeImplementations(originalOlderMethod, optionalOlderMethod);
}

- (void)signInWillDispatch:(GIDSignIn *)signIn error:(NSError *)error {
    
}

// Present a view that prompts the user to sign in with Google
- (void)signIn:(GIDSignIn *)signIn presentViewController:(UIViewController *)viewController {
    //present view controller
    NSLog(@"[INFO] present view controller");
//    [self.onPresent call:nil thisObject:self];
    UIViewController *rootVC = [[[[UIApplication sharedApplication] delegate] window] rootViewController];
//    UIViewController *rootVC = [[TiApp app]controller];
    [rootVC presentViewController:viewController animated:YES completion:nil];
}

// Dismiss the "Sign in with Google" view
- (void)signIn:(GIDSignIn *)signIn dismissViewController:(UIViewController *)viewController {
    //dismiss view controller
    NSLog(@"[INFO] dissmiss view controller");
//    [self.onDissmiss call:nil thisObject:self];
//    UIViewController *rootVC = [[TiApp app]controller];
    UIViewController *rootVC = [[[[UIApplication sharedApplication] delegate] window] rootViewController];
    [rootVC dismissViewControllerAnimated:YES completion:nil];
}

- (BOOL)application:(UIApplication *)application
didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
//    NSError* configureError;
//    [[GIDSignIn sharedInstance] configureWithError: &configureError];
//    NSAssert(!configureError, @"Error configuring Google services: %@", configureError);
    NSLog(@"[INFO] CONFIG");
//    [GIDSignIn sharedInstance].delegate = self;
    
    return YES;
}

- (BOOL)application:(UIApplication *)application handleopenURL:(NSURL *)url sourceApplication:(NSString *)sourceApplication annotation:(id)annotation
{
    NSLog(@"[INFO] OPEN URL");
    return [[GIDSignIn sharedInstance] handleURL:url
                               sourceApplication:sourceApplication
                                      annotation:annotation];
}
- (BOOL)application:(UIApplication *)app
            openURL:(NSURL *)url
            options:(NSDictionary<NSString *,id> *)options {
    NSLog(@"[INFO] OPEN URL");
    return [[GIDSignIn sharedInstance] handleURL:url
                               sourceApplication:options[UIApplicationOpenURLOptionsSourceApplicationKey]
                                      annotation:options[UIApplicationOpenURLOptionsAnnotationKey]];
}

- (BOOL)application:(UIApplication *)application
            openURL:(NSURL *)url
  sourceApplication:(NSString *)sourceApplication
         annotation:(id)annotation {
    NSLog(@"[INFO] OPEN URL Annotation");
    return [[GIDSignIn sharedInstance] handleURL:url
                               sourceApplication:sourceApplication
                                      annotation:annotation];
}

- (BOOL)customUrlHandle:(id) args
{
//    NSDictionary * options = [[TiApp app] launchOptions];
//    NSLog(@"[INFO] Launch Options %@", options);
//    id dat = @{};
//    NSURL *url = [NSURL URLWithString:options[@"url"]];
//    [[GIDSignIn sharedInstance] handleURL: url
//                               sourceApplication:options[@"source"]
//                                      annotation:dat];
    UIViewController *rootVC = [[TiApp app]controller];
    [rootVC dismissViewControllerAnimated:NO completion:nil];
//    NSLog(@"[INFO] Passed Handle URL %@", url);
    return YES;
}

- (void)signIn:(GIDSignIn *)signIn
didSignInForUser:(GIDGoogleUser *)user
     withError:(NSError *)error {
    NSLog(@"[INFO] ON SIGNED IN");
    if(self.onSuccess && !error){
        NSLog(@"[INFO] name %@", user.profile.name);
        NSLog(@"[INFO] email %@", user.profile.email);
        NSLog(@"[INFO] serverAuthCode %@", user.serverAuthCode);
        NSDictionary * data = @{
                            @"name" : user.profile.name,
                            @"email" : user.profile.email,
                            @"id_token" : user.authentication.idToken,
                            @"serverAuthCode" : user.serverAuthCode,
                            @"photo" : [user.profile imageURLWithDimension : 200]
                            };
        NSArray* array = [NSArray arrayWithObjects: data, nil];
        [self.onSuccess call:array thisObject:self];
    }
    else{
        NSLog(@"[INFO] Error %@", error);
    }
}

- (void)signIn:(GIDSignIn *)signIn
didDisconnectWithUser:(GIDGoogleUser *)user
     withError:(NSError *)error {
}

-(void)signIn:(id)args
{
    NSLog(@"[INFO] Clicou SIGNIN");
    [[GIDSignIn sharedInstance] signIn];
    NSLog(@"[INFO] depois Clicou SIGNIN");
}

-(void)signOut:(id)args
{
    NSLog(@"[INFO] Signout");
    [[GIDSignIn sharedInstance] signOut];
}

-(void)silentSignIn:(id)args
{
    NSLog(@"[INFO] silent signin");
    [[GIDSignIn sharedInstance] signInSilently];
}


#pragma Public APIs

-(id)example:(id)args
{
	// example method
	return @"hello world";
}

-(id)exampleProp
{
	// example property getter
	return @"hello world";
}

-(void)setExampleProp:(id)value
{
	// example property setter
}

@end
