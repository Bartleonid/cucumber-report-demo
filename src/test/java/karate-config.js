function fn() {
  var env = java.lang.System.getenv('GIT_BRANCH');
  karate.log("Environment = " + env);
  var config = {
    url: 'https://google.com',
  };
  if (env == 'qa') {
	  config.url = 'https://google.com'
  } else if (env == 'staging') {

  } else if (env == 'master') {

  } else {
    karate.log("env is not defined")
  }
  karate.configure('connectTimeout', 15000);
  karate.configure('readTimeout', 15000);
  return config;
}
