call runcrud.bat

:opening
start D:\Opera\launcher.exe http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL" == "0" goto end
echo Cannot open browser
goto fail

:fail
echo.
echo There were error

:end
echo.
echo Work is finished

