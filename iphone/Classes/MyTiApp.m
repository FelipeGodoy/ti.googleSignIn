//
//  MyTiApp.m
//  authtimesheet
//
//  Created by Codezone on 1/10/17.
//
//
#import "MyTiApp.h"
#import <Foundation/Foundation.h>
#import "TiBase.h"
#import "TiApp.h"
#import "TiHost.h"
#import "TiUtils.h"
#import <objc/runtime.h>

@implementation MyTiApp
#pragma mark Internal

- (BOOL)application:(UIApplication *)app openURL:(NSURL *)url options:(NSDictionary<NSString *,id> *)options
{
    NSLog(@"[INFO] OPEN URL");
    [[GIDSignIn sharedInstance] handleURL:url
                               sourceApplication:options[UIApplicationOpenURLOptionsSourceApplicationKey]
                                      annotation:options[UIApplicationOpenURLOptionsAnnotationKey]];
    [super application:app openURL:url options:options];
    
    return YES;
}

// Handle URL-schemes / iOS < 9
- (BOOL)application:(UIApplication *)application openURL:(NSURL *)url sourceApplication:(NSString *)sourceApplication annotation:(id)annotation
{
    NSLog(@"[INFO] OPEN URL Annotation");
    [[GIDSignIn sharedInstance] handleURL:url
                               sourceApplication:sourceApplication
                                      annotation:annotation];

    [super application:application openURL:url sourceApplication:sourceApplication annotation:annotation];
    
    return YES;
}

@end
