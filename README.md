### Automation test with opened browser manually
1. Open browser manually
2. Use chrome option to execute test in existing browser

   ChromeOptions options = new ChromeOptions();
   
   options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");