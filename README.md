# SeleniumTest
This is a test project to learn how to use Selenium.

The initial script was taken from here: https://www.guru99.com/intellij-selenium-webdriver.html

First of all, I managed to make the example script work with my version of Chrome, because I didn't want to install Firefox.
Then I tried changing the test page to app.sysdigcloud.com, but it didn't work because it could not find the webpage elements in which to write username and password.

My first thought was that was because the script didn't wait for the webpage to load, so I added a WebDriverWait, but it still didn't work.

Then I thought that maybe it was because the link changed, so I tried directly using https://app.sysdigcloud.com/#/login to see if it made any difference. Still no luck.
I added another flat 3 seconds wait just to make sure it wasn't because the page was still not loaded, and it still didn't work, so at this point I knew it wasn't because of the page loading, or at least it wasn't just because of that.

I tried modifying the way the findElement function looked for the elements, but unfortunately my 2 hours time ran out before I could figure out how to make it work.

If I had more time I would also have tried to test the login process with working credentials and with third party accounts. Some other things that would be interesting to check could be:

- Automatically check whether the login was successful or not, without having to manually check, and automatically close the browser page after logging the results.
- Testing the "I forgot my password" process
- Testing the "Sign up" process
- Find out if there's some way to make hundreds of different accounts log in at the same time and see if they all success in doing so.