# spring-attack

![](https://raw.github.com/scottmotte/spring-attack/master/spring-attack.png)

This is an example app for my session at the [SpringOne2Gx](http://www.springone2gx.com/conference/santa_clara/2013/09/springone/event_schedule). It demonstrates combining [SendGrid](http://docs.cloudfoundry.com/docs/dotcom/marketplace/services/sendgrid.html) and [Cloudfoundry](http://cloudfoundry.com/).

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

Next, show how you can see the VCAP_Environment variables.

```bash
cf restart spring-attack
cf files spring-attack logs/env.log
```

Note the username and password in the VCAP_SERVICES and then lets set those as environment variables.

```bash
cf set-env spring-attack SENDGRID_USERNAME username
cf set-env spring-attack SENDGRID_PASSWORD password
```

Note that they are in there.

```bash
cf env spring-attack
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

1) Set the `SENDGRID_USERNAME` and `SENDGRID_PASSWORD` environment variables.

```bash
export SENDGRID_USERNAME=your_username
export SENDGRID_PASSWORD=your_password
```

2) Then build and serve the war file.

```bash
gradle jettyRunWar
```

3) Visit [http://localhost:8080](http://localhost:8080).
