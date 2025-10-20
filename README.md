# WeatherWeb

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SRE Debug Pod</title>
    <style>
        body {
            background-color: #0d0d0d;
            color: #00ffcc;
            font-family: 'Courier New', monospace;
            padding: 20px;
        }
        pre {
            color: #b366ff;
            font-size: 14px;
            white-space: pre;
            line-height: 1.2;
        }
        .section {
            border-top: 1px solid #333;
            margin-top: 20px;
            padding-top: 10px;
        }
        a {
            color: #00ffcc;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        h3 {
            color: #66ff99;
        }
    </style>
</head>
<body>

    <pre>
███████╗██████╗ ███████╗
██╔════╝██╔══██╗██╔════╝
███████╗██████╔╝███████╗
╚════██║██╔══██╗╚════██║
███████║██║  ██║███████║
╚══════╝╚═╝  ╚═╝╚══════╝

Site Reliability Engineering (SRE) Debug Pod
---------------------------------------------
    </pre>

    <div class="section">
        <h3>🧰 Debug Tool</h3>
        <p>✅ Pod is running inside Kubernetes</p>
        <p>✅ Ready to test internal DNS / HTTP / Ports</p>
    </div>

    <div class="section">
        <p>🔗 Try: <code>/dns?host=&lt;your-internal-host&gt;</code></p>
        <p>Example: <a href="/dns?host=myapp.svc.cluster.local">/dns?host=myapp.svc.cluster.local</a></p>
    </div>

</body>
</html>

_------_-----------------_----------------_--------------------_----------

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>SRE Debug Pod</title>
  <style>
    body {
      background-color: #0d0d0d;
      color: #00ffcc;
      font-family: 'Courier New', monospace;
      padding: 20px;
    }

    pre {
      font-size: 14px;
      line-height: 1.2;
      white-space: pre;
      animation: glow 2s ease-in-out infinite alternate;
      color: #b366ff;
    }

    @keyframes glow {
      from {
        text-shadow: 0 0 5px #9933ff, 0 0 10px #6600cc, 0 0 20px #330066;
      }
      to {
        text-shadow: 0 0 10px #cc99ff, 0 0 20px #9933ff, 0 0 40px #6600cc;
      }
    }

    h3 {
      color: #66ff99;
    }

    .section {
      border-top: 1px solid #333;
      margin-top: 20px;
      padding-top: 10px;
    }

    a {
      color: #00ffcc;
      text-decoration: none;
    }

    a:hover {
      text-decoration: underline;
    }

    .cursor {
      display: inline-block;
      width: 10px;
      background-color: #00ffcc;
      animation: blink 1s step-end infinite;
    }

    @keyframes blink {
      50% {
        background-color: transparent;
      }
    }
  </style>
</head>
<body>

  <pre>
███████╗██████╗ ███████╗
██╔════╝██╔══██╗██╔════╝
███████╗██████╔╝███████╗
╚════██║██╔══██╗╚════██║
███████║██║  ██║███████║
╚══════╝╚═╝  ╚═╝╚══════╝

Site Reliability Engineering (SRE) Debug Pod
---------------------------------------------
  </pre>

  <div class="section">
    <h3>🧰 Debug Tool</h3>
    <p>✅ Pod is running inside Kubernetes</p>
    <p>✅ Ready to test internal DNS / HTTP / Ports</p>
  </div>

  <div class="section">
    <p>🔗 Try: <code>/dns?host=&lt;your-internal-host&gt;</code></p>
    <p>Example: <a href="/dns?host=myapp.svc.cluster.local">/dns?host=myapp.svc.cluster.local</a></p>
  </div>

  <div class="section">
    <p>💡 Status: <span class="cursor"></span></p>
  </div>

</body>
</html>
