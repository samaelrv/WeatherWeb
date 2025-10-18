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

#!/usr/bin/env python3
"""
Draws a 'filled' ASCII banner in terminal by replacing non-space glyphs
with solid block characters and coloring them electric-orange (#FF6600).
"""

import os
import sys

# Optional: on Windows, if colorama is installed it will make ANSI work reliably
try:
    import colorama
    colorama.init()
except Exception:
    # colorama not required; script still attempts to use ANSI escapes
    pass

# Your original ASCII banner lines (preserve exact spacing)
BANNER = [
"  ____  ____  _____ ____  _____ ",
" / ___||  _ \\| ____|  _ \\| ____|",
" \\___ \\| |_) |  _| | | | |  _|  ",
"  ___) |  _ <| |___| |_| | |___ ",
" |____/|_| \\_\\_____|____/|_____|"
]

# You can change this to False to use a fallback char instead of the block glyph
USE_BLOCK_GLYPH = True

# Fallback char if terminal doesn't render block glyph well
FALLBACK_CHAR = "#"

# ANSI truecolor foreground (not needed if we color the blocks only, but fine)
ORANGE = "\033[38;2;255;102;0m"   # electric orange (#FF6600)
RESET = "\033[0m"

# The glyph to draw for each "non-space" pixel
BLOCK = "█" if USE_BLOCK_GLYPH else FALLBACK_CHAR

def supports_unicode_block():
    # Quick check: if stdout encoding supports utf-8
    try:
        return sys.stdout.encoding.lower().startswith("utf")
    except Exception:
        return False

def draw_filled_banner(lines):
    use_block = BLOCK
    # if terminal likely doesn't support unicode block, fall back
    if USE_BLOCK_GLYPH and not supports_unicode_block():
        use_block = FALLBACK_CHAR

    # Build and print each line: replace every non-space char with block
    out_lines = []
    for line in lines:
        filled = "".join(use_block if ch != " " else " " for ch in line)
        out_lines.append(filled)

    # Print with orange color
    print(ORANGE + "\n".join(out_lines) + RESET)

if __name__ == "__main__":
    # If terminal width is small, we can center or simply print as-is.
    # Currently printing as-is to preserve exact layout.
    draw_filled_banner(BANNER)
