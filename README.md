# spring-attack

This is an example app for my session at the [SpringOne2Gx](http://www.springone2gx.com/conference/santa_clara/2013/09/springone/event_schedule). It demonstrates combining [SendGrid](http://docs.cloudfoundry.com/docs/dotcom/marketplace/services/sendgrid.html) and [Cloudfoundry](http://cloudfoundry.com/).

![](https://raw.github.com/scottmotte/spring-attack/master/spring-attack.png)

## Demo

Show the app code. Run it with gradle jettyRunWar locally.

Show that you then do `gem install cf` but just in a slide.

Go through the following steps live.

```bash
cf target api.run.pivotal.io
cf login
gradle assemble
cf push --path build/libs/spring-attack.war
```

Then show the live running app. Then add SendGrid.

```bash
cf create-service sendgrid
cf bind-service
```

## Production

### Deploy to Cloud Foundry

```bash
gem install cf
cf target api.run.pivotal.io
cf login
gradle assemble
cf push --path build/libs/spring-attack.war
```
## Development

### Usage

```bash
gradle jettyRunWar
```

Visit [http://localhost:8080](http://localhost:8080).
