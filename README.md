# Javarush Telegram Bot

## MVP Scope
As a user, I want to subscribe on group of posts and get notification via telegram-bot every time,
when new post, related to group subscriptions, has come.

# How it works
Based on MVP Scope, we can specify next behaviours (here and after Telegram User, which is using JavaRush Telgegram bot will call User):
- User can subscribe on group of posts
- User can view list of group subscriptions on which user subscribes
- User can unsubscribe from group of posts
- User can set an inactive bot and do not receive notifications
- User can restart getting notifications
## Find new posts workflow
The workflow of finding new posts and send them to subscribers can be viewed here:
![Find_New_Posts_WF](https://user-images.githubusercontent.com/16310793/119827993-6c22ec80-bf02-11eb-8759-83bea483db93.png)

# Technological stack
- SpringBoot as a skeleton framework
- Spring Scheduler as a task manager
- MySQL database as a database for saving user and subscription info
- Flyway database migration tool
- Telegram-bot SpringBoot starter
- Spring Data starter
- Unirest - lib for working with REST calls

## Code of Conduct
Please, follow [Code of Conduct](CODE_OF_CONDUCT.md) page.

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details