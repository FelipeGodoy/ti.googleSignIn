/* C++ code produced by gperf version 3.0.1 */
/* Command-line: gperf -L C++ -E -t D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "ti.authtimesheet.SigninProxy.h"
#include "ti.authtimesheet.AuthtimesheetModule.h"


#line 14 "D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 9, duplicates = 0 */

class AuthtimesheetBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
AuthtimesheetBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
AuthtimesheetBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 2,
      MIN_WORD_LENGTH = 28,
      MAX_WORD_LENGTH = 36,
      MIN_HASH_VALUE = 28,
      MAX_HASH_VALUE = 36
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""},
#line 17 "D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf"
      {"ti.authtimesheet.SigninProxy",::ti::authtimesheet::authtimesheet::SigninProxy::bindProxy,::ti::authtimesheet::authtimesheet::SigninProxy::dispose},
      {""}, {""}, {""}, {""}, {""}, {""}, {""},
#line 16 "D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf"
      {"ti.authtimesheet.AuthtimesheetModule",::ti::authtimesheet::AuthtimesheetModule::bindProxy,::ti::authtimesheet::AuthtimesheetModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      register int key = hash (str, len);

      if (key <= MAX_HASH_VALUE && key >= 0)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 18 "D:/Documents/titanium_projects/authtimesheet/android/build/generated/KrollGeneratedBindings.gperf"

