name := "SoupTCP"

scalaVersion := "2.11.6"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

scalacOptions ++= Seq(
  "-language:higherKinds",
  "-feature",
  "-deprecation",
  "-unchecked",
  "-optimise",
  "-explaintypes",
  "-Xcheckinit",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xverify",
  "-Yclosure-elim",
  "-Ydead-code",
  "-Yinline"
)

triggeredMessage := (_ => Watched.clearScreen)

libraryDependencies ++= Seq(
  "org.scalaz"    %% "scalaz-core"       % "7.1.0",
  "org.scalatest" %% "scalatest"         % "2.2.4",
  "commons-lang"  %  "commons-lang"      % "2.6",
  // "org.jdave"     %  "jdave-junit4"      % "1.2"    % "test",
  // "jdave-sbt"     %  "jdave-sbt_2.10"    % "0.2"    % "test",
  "jline"         %  "jline"             % "0.9.94",
  "org.jmock"     %  "jmock"             % "2.5.1"  % "test",
  "org.joda"      %  "joda-convert"      % "1.2",
  "joda-time"     %  "joda-time"         % "2.1",
  "com.novocode"  %  "junit-interface"   % "0.10"   % "test",
  "log4j"         %  "log4j"             % "1.2.17",
  "org.mockito"   %  "mockito-core"      % "1.9.0"  % "test",
  "org.mongodb"   %  "mongo-java-driver" % "2.7.2"
)

